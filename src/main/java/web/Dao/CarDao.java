package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDao implements Dao{
    final List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> listCar() {
        cars.add(new Car("Camry", 2022, 28000));
        cars.add(new Car("Rav4", 2021, 32000));
        cars.add(new Car("Corolla", 2020, 22000));
        cars.add(new Car("Prado", 2024, 68000));
        cars.add(new Car("Vitz", 2018, 17000));
        return cars;
    }
}
