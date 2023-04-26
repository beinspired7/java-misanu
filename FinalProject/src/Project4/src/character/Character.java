package character;

import message.Message;
import praksa.FileHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Character {
    String fullName;
    String allegiance;
    String messageFile;

    public Character(String ...args) {
        this.fullName = args[0];
        this.allegiance = args[1];
        this.messageFile = args[2];
    }

    public Character(String fullName, String allegiance, String messageFile) {
        this.fullName = fullName;
        this.allegiance = allegiance;
        this.messageFile = messageFile;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public String getMessageFile() {
        return messageFile;
    }

    public List<String> getMessages() {
        return FileHelper.loadMessages(getMessageFile());
    }

    public List<Message> getSentMessages() {
        return message.Loader.getInstance().load().stream().filter(message -> message.getSender().equals(this)).toList();
    }

    private int getEmoticonScore(String[] emoticons) {
        String messages = getSentMessages().stream().map(Message::getContent).reduce((ms, ms2) -> ms + ms2).orElse("");

        int counter = 0;

        for (String emoticon: emoticons) {
            counter += messages.split(emoticon).length-1;
        }

        return counter;
    }

    public int getSadScore() {
        return getEmoticonScore(new String[]{"😞", "😢"});
    }

    public int getHappyScore() {
        return getEmoticonScore(new String[]{"🙂", "😄"});
    }

    public int getMoodScore() {
        return getHappyScore() - getSadScore();
    }

    public void printGeneralMood() {
        String mood = "balanced";

        if (getMoodScore() < 0) {
            mood = "sad";
        }

        if (getMoodScore() > 0) {
            mood = "happy";
        }

        System.out.printf("%s has %s mood%n", getFullName(), mood);
    }
}
