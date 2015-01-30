package no.nerdschool.pakkesporing;

public abstract class Pakkestatus {
    private final String pakkeId;
    private final String tidspunkt;

    public Pakkestatus(String pakkeId, String tidspunkt) {
        this.pakkeId = pakkeId;
        this.tidspunkt = tidspunkt;
    }

    public String getPakkeId() {
        return pakkeId;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }
}
