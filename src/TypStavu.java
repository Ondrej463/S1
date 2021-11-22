public enum TypStavu {
    S0("S0"),
    S1("S1"),
    S2("S2"),
    S3("S3");
    private String stav;

    TypStavu(String typ) {
        this.stav = typ;
    }
    String getString() {
        return this.stav;
    }
}
