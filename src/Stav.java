public class Stav {
    private TypStavu stav;

    public Stav(TypStavu stav) {
        this.stav = stav;
    }

    public void zmenStav(int a, int b) {
        switch(this.stav) {
            case S0:
                if (a == 0 && b == 1) {
                    this.stav = TypStavu.S1;
                }
                break;
            case S1:
                if (a == 1) {
                    if (b == 0) {
                        this.stav = TypStavu.S2;
                    } else {
                        this.stav = TypStavu.S0;
                    }
                }
                break;
            case S2:
                if (a == 0 && b == 0) {
                    this.stav = TypStavu.S1;
                } else if (a == 0 && b == 1) {
                    this.stav = TypStavu.S3;
                }
                break;
            case S3:
                if (a == 1 && b == 1) {
                    this.stav = TypStavu.S2;
                }
        }
    }
    public TypStavu getStav() {
        return this.stav;
    }
    String getSvetelnaSignalizacia() {
        if (this.stav == TypStavu.S0 || this.stav == TypStavu.S1) {
            return "zelená";
        } else {
            return "červená";
        }
    }
}
