package no.nerdschool.pakkesporing;

public class PakkeUtvlevert extends Pakkestatus {

    private final String sted;
    private final String status;

    public PakkeUtvlevert(String pakkeId, String tidspunkt, String sted, String status) {
        super(pakkeId, tidspunkt);

        this.sted = sted;
        this.status = status;
    }

    public String getSted() {
        return sted;
    }

    public String getStatus() {
        return status;
    }
}
