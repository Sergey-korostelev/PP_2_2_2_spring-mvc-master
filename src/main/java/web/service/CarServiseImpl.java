package web.service;

import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> refreshListCar(List<Car> list, int count) {
        if (count > 5) return list;
        if (count < 0) {
            return list.stream().limit(0).collect(Collectors.toList());
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
