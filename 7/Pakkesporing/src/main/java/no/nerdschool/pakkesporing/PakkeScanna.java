package no.nerdschool.pakkesporing;

public class PakkeScanna extends Pakkestatus {

    private final String sted;

    public PakkeScanna(String pakkeId, String tidspunkt, String sted) {
        super(pakkeId, tidspunkt);

        this.sted = sted;
    }

    public String getSted() {
        return sted;
    }
}
