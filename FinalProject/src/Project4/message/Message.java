package Project4.message;

import Project4.character.Character;

public class Message {
    Character sender;
    Character recipient;
    String content;

    public Message(Character sender, Character recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public Character getSender() {
        return sender;
    }

    public Character getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }
}
