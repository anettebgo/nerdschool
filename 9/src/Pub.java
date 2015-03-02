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
            pris = ingrediens6() + ingrediens5() + ingrediens4();
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            pris = ingrediens6()/2 + ingrediens1() + ingrediens2() + ingrediens3();
        }
        else {
            throw new RuntimeException("Finnes ikke i sortimentet");
        }
        if (student && (drink == EN_CIDER || drink == EN_OL || drink == EN_ORDENDTLIG_CIDER)) {
            pris = pris - pris/10;
        }
        return pris*antall;
    }

    //en enhet med rom
    private int ingrediens1() {
        return 65;
    }

    //en enhet med grenadine
    private int ingrediens2() {
        return 10;
    }

    //en enhet med limejuice
    private int ingrediens3() {
        return 10;
    }
    
    //en enhet med grønne greier
    private int ingrediens4() {
        return 10;
    }

    //en enhet med tonic-vann
    private int ingrediens5() {
        return 20;
    }

    //en enhet med gin
    private int ingrediens6() {
        return 85;
    }
}
