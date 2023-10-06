package smart.parking.smartparking.entities;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    private String id;
    private String carName;
    private CarCategory carCategory;

    @OneToOne
    private Emission emission;

    public Car() {}

    public Car(String id, CarCategory carCategory, Emission emission) {
        this.id = id;
        this.carCategory = carCategory;
        this.emission = emission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    public Emission getEmission() {
        return emission;
    }

    public void setEmission(Emission emission) {
        this.emission = emission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", carName='" + carName + '\'' +
                ", carCategory=" + carCategory +
                ", emission=" + emission +
                '}';
    }
}
