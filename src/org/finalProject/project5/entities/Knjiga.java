package org.finalProject.project5.entities;

public class Knjiga extends Entity {
    int isbn;
    String naziv;
    String jezik;
    String izdavac;
    String odeljenje;
    String decijeUzrast;
    String pozajmnoZanr;
    String naucnaOblast;

    public static void main(String[] args) {
        Knjiga dis = new Knjiga();
    }

    protected String getTable() {
        return "biblioteke";
    }

    protected String[] getFields() {
        return new String[] {
                "isbn",
                "naziv",
                "jezik",
                "izdavac",
                "odeljenje",
                "decijeUzrast",
                "pozajmnoZanr",
                "naucnaOblast",
        };
    }
}
