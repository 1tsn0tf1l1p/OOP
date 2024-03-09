package robot;

public enum Boja {

    PLAVA("#0000FF"),
    ZUTA("#FFFF00"),
    CRVENA("#FF0000"),
    ZELENA("#00FF00"),
    ROZE("#FFC0CB");

    private final String hexCode;

    Boja(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
