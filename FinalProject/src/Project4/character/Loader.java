package Project4.character;

import Project4.praksa.FileHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Loader extends Project4.contract.Loader<Character> {
    private Loader() {}
    private static Loader instance = null;
    public static Loader getInstance() {
        if (instance == null) {
            instance = new Loader();
        }
        return instance;
    }

    public List<Character> load() {
        if (items != null) {
            return items;
        }
        String metaStr = FileHelper.loadMetaData();

        List<String> metas = Arrays.asList(metaStr.split("\n"));
        metas = metas.subList(1, metas.size());


        items = metas.stream().map(meta -> new Character(meta.trim().split(", "))).collect(Collectors.toList());

        return items;
    }
}
