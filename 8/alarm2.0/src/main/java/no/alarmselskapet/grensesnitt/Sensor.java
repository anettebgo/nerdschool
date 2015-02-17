package no.alarmselskapet.grensesnitt;

public interface Sensor {
    public boolean erUtløst();
    public String hentPlassering();
    public String hentSensortype();
}
