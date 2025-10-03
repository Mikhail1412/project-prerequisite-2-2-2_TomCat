package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getList(int count) {
        if (count <= 0) {
            return List.of();
        }
        List<Car> all = carDao.getList();
        if (count >= all.size()) {
            return all;
        }
        return all.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getAll() {
        return carDao.getList();   // просто вернуть полный список из DAO

    }
}