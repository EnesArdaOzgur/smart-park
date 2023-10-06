package smart.parking.smartparking.entities;

public enum CarCategory {

    SMALL_CAR(0.7),
    CAR(1.0),
    BIG_CAR(1.3);
    private final Double emisisonFactor;

    CarCategory(Double emisisonFactor) {
        this.emisisonFactor = emisisonFactor;
    }

    public Double getEmisisonFactor() {
        return emisisonFactor;
    }
}
