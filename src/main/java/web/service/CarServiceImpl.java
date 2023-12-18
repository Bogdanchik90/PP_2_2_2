package web.service;


import web.dao.CarDao;
import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<?> getCars(Integer count) {
        return carDao.getCars(count);
    }
}
