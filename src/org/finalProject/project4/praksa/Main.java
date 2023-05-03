package org.finalProject.project4.praksa;

import org.finalProject.project4.item.Character;
import org.finalProject.project4.loader.Loader;
import org.finalProject.project4.loader.Type;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Stream<Character> getCharacterStream() throws IOException {
        return Loader.getInstance().load(Type.CHARACTER).stream().map(Character.class::cast);
    }

    private static Character getCharacterByName(String fullName) {
        try {
            return getCharacterStream().filter(character -> character.getFullName().equals(fullName)).findFirst()
                    .orElse(null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        // 2. Одштампајте све поруке особе Daenerys
        getCharacterStream().filter(character -> character.getFullName().equals("Daenerys Stormborn"))
                .findFirst().ifPresent(daenerys -> daenerys.getMessages().forEach(System.out::println));

        // 3. Креирајте обавештење које приказује број порука који се сваки карактер послао
        getCharacterStream().forEach(character -> {
            System.out.printf("%s has %d sent messages%n", character.getFullName(), character.getSentMessages().size());
        });

        // 4. Урадити анализу карактера, бројећи њихову употребу смајлија
        getCharacterStream().forEach(Character::printGeneralMood);


        // 5. Одштампати карактер који има најпозитивнију и најнегативнију диспозицију.
        List<Character> sortedChars = getCharacterStream()
                .sorted( (char1, char2) -> Integer.compare(char2.getMoodScore(), char1.getMoodScore())).collect(Collectors.toList());
        System.out.println("Character with the most positive disposition is " + sortedChars.get(0).getFullName());
        System.out.println("Character with the most negative disposition is " + sortedChars.get(sortedChars.size() - 1).getFullName());

        // 6. Да ли Jon воли Daenerys више него што она воли њега.
        Character daenerys = getCharacterByName("Daenerys Stormborn");
        Character jon = getCharacterByName("Jon Snow");

        if (Arrays.stream(new Character[] {daenerys, jon}).allMatch(Objects::nonNull)) {

            System.out.format("%1$s likes %2$s more than %2$s likes %1$s%n", Arrays.stream(new Character[]{daenerys, jon})
                    .sorted((char1, char2) -> Integer.compare(char2.getMoodScore(char1), char1.getMoodScore(char2))).toArray());
        }

        System.exit(0);
    }

}
