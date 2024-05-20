package web.service;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> refreshListCar (int count);
}
