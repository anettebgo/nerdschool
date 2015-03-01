package no.nerdschool.pakkesporing;

public class PakkeRegistrert extends Pakkestatus {

    private final String fraSted;
    private final String tilSted;

    public PakkeRegistrert(String pakkeId, String tidspunkt, String fraSted, String tilSted) {
        super(pakkeId, tidspunkt);
        this.fraSted = fraSted;
        this.tilSted = tilSted;
    }

    public String getFraSted() {
        return fraSted;
    }

    public String getTilSted() {
        return tilSted;
    }
}
