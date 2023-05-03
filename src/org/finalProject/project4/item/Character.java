package org.finalProject.project4.item;

import org.finalProject.project4.loader.Loader;
import org.finalProject.project4.loader.Type;
import org.finalProject.project4.praksa.FileHelper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Креирајте класу карактера која садржи податке за сваки карактер у got_meta_data.txt фајлу.
public class Character implements Item {
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
        try {
            List<Message> messages = Loader.getInstance().load(Type.MESSAGE).stream().map(Message.class::cast).filter(
                    message -> message.getSender().getFullName().equals(this.getFullName())
            ).collect(Collectors.toList());
            return messages;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private Stream<Message> getSentMessagesStream(Character character) {
        return character != null
                ? getSentMessages().stream().filter(message -> message.getRecipient().equals(character))
                : getSentMessages().stream();
    }

    private int getEmoticonScore(String[] emoticons, Character character) {
        Stream<Message> sentMessagesStream = character == null
                ? getSentMessages().stream().filter(message -> message.getRecipient().equals(this))
                : getSentMessages().stream();

        String messages = getSentMessagesStream(character).map(Message::getContent).reduce((ms, ms2) -> ms + ms2).orElse("");

        int counter = 0;

        for (String emoticon: emoticons) {
            counter += messages.split(emoticon).length-1;
        }

        return counter;
    }

    public int getSadScore(Character character) {
        return getEmoticonScore(new String[]{"😞", "😢"}, character);
    }

    public int getHappyScore(Character character) {
        return getEmoticonScore(new String[]{"🙂", "😄"}, character);
    }

    public int getMoodScore(Character character) {
        return getHappyScore(character) - getSadScore(character);
    }

    public int getMoodScore() {
        return getMoodScore(null);
    }

    public void printGeneralMoodTowards(Character character) {
        String mood = "balanced";

        if (getMoodScore(character) < 0) {
            mood = "sad";
        }

        if (getMoodScore(character) > 0) {
            mood = "happy";
        }

        System.out.printf("%s has %s mood%n", getFullName(), mood);
    }

    public void printGeneralMood() {
        printGeneralMoodTowards(null);
    }

    @Override
    public String toString() {
        return fullName;
    }
}
