package web.service;


import org.springframework.stereotype.Component;
import web.dao.CarDao;
import java.util.List;

@Component
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
