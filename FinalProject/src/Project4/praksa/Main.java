package Project4.praksa;

import Project4.character.Character;
import Project4.character.Loader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> st = Loader.getInstance().load();

        st.get(0).getMessages().forEach(System.out::println);

        st.forEach(character -> System.out.printf("%s has %d sent messages%n", character.getFullName(), character.getSentMessages().size()));

        st.forEach(Character::printGeneralMood);
        System.out.println(1);
    }
}
