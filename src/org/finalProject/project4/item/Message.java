package org.finalProject.project4.item;

import java.io.Serializable;

public class Message implements Item {
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
