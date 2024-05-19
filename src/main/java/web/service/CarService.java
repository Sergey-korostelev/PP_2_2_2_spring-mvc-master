package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> refreshListCar (List<Car> list, int count);
}
