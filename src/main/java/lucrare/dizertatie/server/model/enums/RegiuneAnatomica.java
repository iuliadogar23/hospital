package lucrare.dizertatie.server.model.enums;

public enum RegiuneAnatomica {
    HEAD_THROAT("Cap/Gat"),
    FACE("Fata"),
    CHEST("Torace"),
    ABDOMEN_PELVIS("Abdomen/Pelvis"),
    PELVIS_EXTREMITIES("Extremitati/Centura pelviana"),
    EXTERN("Extern(Tegument)");
    private final String regiune;

    RegiuneAnatomica(String region) {
        this.regiune = region;
    }

    public String getRegiune() {
        return regiune;
    }

}
