public class Pub {


    public static final String EN_OL = "hansa";
    public static final String EN_CIDER = "grans";
    public static final String EN_ORDENDTLIG_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public int beregnPris(String drink, boolean student, int antall) {

        if (antall > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            throw new RuntimeException("For mange drinker, max 2.");
        }
        int pris = 0;
        if (drink.equals(EN_OL)) {
            pris = 74;
        }
        else if (drink.equals(EN_CIDER)) {
            pris = 103;
        }
        else if (drink.equals(EN_ORDENDTLIG_CIDER)) pris = 110;
        else if (drink.equals(GT)) {
            pris = enGin() + tonic() + gronneGreier();
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            pris = enGin()/2 + enRom() + grenadine() + limeJuice();
        }
        else {
            throw new RuntimeException("Finnes ikke i sortimentet");
        }
        if (student && (drink == EN_CIDER || drink == EN_OL || drink == EN_ORDENDTLIG_CIDER)) {
            pris = pris - pris/10;
        }
        return pris*antall;
    }

    private int enRom() {
        return 65;
    }

    private int grenadine() {
        return 10;
    }

    private int limeJuice() {
        return 10;
    }

    private int gronneGreier() {
        return 10;
    }

    private int tonic() {
        return 20;
    }

    private int enGin() {
        return 85;
    }
}
