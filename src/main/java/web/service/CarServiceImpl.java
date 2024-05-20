package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao dao;

    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> refreshListCar(int count) {
        if (count > 5) return dao.listCar();
        if (count < 0) {
            return dao.listCar().stream().limit(0).collect(Collectors.toList());
        }
        return dao.listCar().stream().limit(count).collect(Collectors.toList());
    }
}
