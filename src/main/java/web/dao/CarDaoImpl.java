package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {

    private List<?> cars;



    public CarDaoImpl() {
        Car lada = new Car("lada",2,110000);
        Car bmw = new Car("bmw",5,20000);
        Car audi = new Car("audi", 4,51000);
        Car mers = new Car("mers",7,1200);
        Car geely = new Car("geely", 1,500);
        List<Car> list = new ArrayList<>();
        list.add(lada);
        list.add(bmw);
        list.add(audi);
        list.add(mers);
        list.add(geely);
        cars = list;
    }

    public List<?> getCars(Integer count) {
        if (count == null || count >= 5)
            return cars;

        return cars.subList(0,count);
    }
}
