package web.service;

import web.Dao.CarDao;
import web.Dao.Dao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImpl implements CarService{
    public Dao dao = new CarDao();
    @Override
    public List<Car> refreshListCar(int count) {
        if (count > 5) return dao.listCar();
        if (count < 0) {
            return dao.listCar().stream().limit(0).collect(Collectors.toList());
        }
        return dao.listCar().stream().limit(count).collect(Collectors.toList());
    }
}
