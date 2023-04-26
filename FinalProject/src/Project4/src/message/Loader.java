package message;

import character.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader extends contract.Loader<Message> {
    private Loader() {}
    private static Loader instance = null;
    public static Loader getInstance() {
        if (instance == null) {
            instance = new Loader();
        }
        return instance;
    }

    public List<Message> load() {
        if (items != null) {
            return items;
        }

        character.Loader cl = character.Loader.getInstance();
        List<Character> characters = cl.load();

        items = characters.stream().map(recipient -> {
            List<String> msgs = recipient.getMessages();
            msgs.remove(0);

            Pattern messagePattern = Pattern.compile("^(.*), \"(.*)\"");

            return msgs.stream().map(message -> {
                Matcher matcher = messagePattern.matcher(message);
                if (!matcher.find()) {
                    return null;
                }
                Character senderCharacter = characters.stream().filter(
                        sender -> sender.getFullName().equals(matcher.group(1))
                ).findFirst().orElse(null);
                if (senderCharacter == null) {
                    return null;
                }

                return new Message(senderCharacter, recipient, matcher.group(2));
            }).toList();
        }).reduce(new ArrayList<>(), (cumulate, list) -> {
            cumulate.addAll(list);
            return cumulate;
        }).stream().filter(Objects::nonNull).toList();

        return items;
    }
}
