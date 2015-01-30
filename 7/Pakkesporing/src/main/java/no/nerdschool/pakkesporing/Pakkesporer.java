package no.nerdschool.pakkesporing;

public interface Pakkesporer {
    public String getPakkestatusForPakkeId(String pakkeId);
    public void handterNyPakkestatus(Pakkestatus pakkestatus);
}
