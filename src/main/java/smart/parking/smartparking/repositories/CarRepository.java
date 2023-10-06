package smart.parking.smartparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.parking.smartparking.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
}