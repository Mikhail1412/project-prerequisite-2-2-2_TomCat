package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "black"));
        cars.add(new Car("Audi", 4, "white"));
        cars.add(new Car("Toyota", 7, "silver"));
        cars.add(new Car("Kia", 5, "red"));
        cars.add(new Car("Tesla", 1, "blue"));
        return cars;
    }
}
