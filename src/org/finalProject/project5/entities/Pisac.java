package org.finalProject.project5.entities;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Pisac extends Entity{
    @Override
    protected String getTable() {
        return "pisac";
    }

    @Override
    protected String[] getFields() {
        return new String[] {
                "ime_prezime_pisca"
        };
    }

    public static void main(String[] args) throws SQLException {
        Pisac psc = new Pisac();

        Map<String, Object> mapa = new HashMap<>();
        mapa.put("ime_prezime_pisca", "Pisac 123");

        psc.delete(1);
        psc.update(2, mapa);

        psc.insert(mapa);

        Map<String, Object> pisac2 = psc.get(2);

        Map<Integer, Map<String, Object>> pisci = psc.index();

        System.exit(1);
    }
}
