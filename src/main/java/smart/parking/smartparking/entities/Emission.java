package smart.parking.smartparking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emission {

    @Id
    private String id;
    private Integer co2;
    private Integer nox;
    private Integer noiseLevel;

    public Emission(Integer co2, Integer nox, Integer noiseLevel) {
        this.co2 = co2;
        this.nox = nox;
        this.noiseLevel = noiseLevel;
    }

    public Emission() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCo2() {
        return co2;
    }

    public void setCo2(Integer co2) {
        this.co2 = co2;
    }

    public Integer getNox() {
        return nox;
    }

    public void setNox(Integer nox) {
        this.nox = nox;
    }

    public Integer getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(Integer noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    @Override
    public String toString() {
        return "Emission{" +
                "id='" + id + '\'' +
                ", co2=" + co2 +
                ", nox=" + nox +
                ", noiseLevel=" + noiseLevel +
                '}';
    }
}
