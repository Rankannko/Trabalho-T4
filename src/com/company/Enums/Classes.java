package com.company.Enums;

public enum Classes {
    ARTIFICER("Artificer"),
    BARBARO("Barbaro"),
    BARDO("Bardo"),
    CLERIGO("Clerigo"),
    DRUIDA("Druida"),
    LUTADOR("Lutador"),
    MONJE("Monje"),
    PALADINO("Paladino"),
    CACADOR("Cacador"),
    LADINO("Ladino"),
    MAGO("Mago"),
    FEITICEIRO("Feiticeiro"),
    BRUXO("Bruxo");
    private String text;

    Classes(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Classes fromString(String text) {
        for (Classes classe : Classes.values()) {
            if (classe.text.equalsIgnoreCase(text)) {
                return classe;
            }
        }
        return null;
    }
}
