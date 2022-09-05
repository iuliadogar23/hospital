package lucrare.dizertatie.server.model.enums;

public enum GrupaSanguina {
    ZERO_POS("0+"),
    ZERO_NEG("0-"),
    A_POS("A+"),
    A_NEG("A-"),
    B_POS("B+"),
    B_NEG("B-"),
    AB_POS("AB+"),
    AB_NEG("AB-");
    private final String nume;

    GrupaSanguina(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
