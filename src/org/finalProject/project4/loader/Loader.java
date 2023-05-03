package org.finalProject.project4.loader;

import org.finalProject.project4.item.Character;
import org.finalProject.project4.item.Item;
import org.finalProject.project4.item.Message;
import org.finalProject.project4.praksa.FileHelper;

import java.io.IOException;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Loader {
    private Map<Type, List<Item>> items = new HashMap<>();
    private static Loader instance = null;

    private Loader() {
        try {
            this.items = FileHelper.getItems();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Loader getInstance() {
        if (instance == null) {
            instance = new Loader();
        }
        return instance;
    }

    public List<Item> load(Type type) throws IOException {
        if (this.items.containsKey(type)) {
            return this.items.get(type);
        }

        List<Item> items = switch (type) {
            case CHARACTER -> loadCharacters();
            case MESSAGE -> loadMessages();
        };

        this.items.put(type, items);
        FileHelper.storeItems(this.items);

        return items;
    }

    public List<Item> loadCharacters() {
        String metaStr = FileHelper.loadMetaData();

        List<String> metas = Arrays.asList(metaStr.split("\n"));
        metas = metas.subList(1, metas.size());


        return metas.stream().map(meta -> (Item) new Character(meta.trim().split(", "))).collect(Collectors.toList());
    }

    public List<Item> loadMessages() throws IOException {
        List<Item> characters = this.load(Type.CHARACTER);

        return characters.stream().map(Character.class::cast).map(recipient -> {
            List<String> msgs = recipient.getMessages();
            msgs.remove(0);

            Pattern messagePattern = Pattern.compile("^(.*), \"(.*)\"");

            return msgs.stream().map(message -> {
                Matcher matcher = messagePattern.matcher(message);
                if (!matcher.find()) {
                    return null;
                }
                Character senderCharacter = characters.stream().map(Character.class::cast).filter(
                        sender -> sender.getFullName().equals(matcher.group(1))
                ).findFirst().orElse(null);

                if (senderCharacter == null) {
                    return null;
                }

                return (Item) new Message(senderCharacter, recipient, matcher.group(2));
            }).collect(Collectors.toList());
        }).reduce(new ArrayList<>(), (cumulate, list) -> {
            cumulate.addAll(list);
            return cumulate;
        }).stream().filter(Objects::nonNull).collect(Collectors.toList());
    }
}
