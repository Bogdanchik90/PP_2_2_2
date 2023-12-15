package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(Integer count) {

        Car lada = new Car("lada", 2, 110000);
        Car bmw = new Car("bmw", 5, 20000);
        Car audi = new Car("audi", 4, 51000);
        Car mers = new Car("mers", 7, 1200);
        Car geely = new Car("geely", 1, 500);
        List<Car> list = new ArrayList<>();

        if (count == null) {
            list.add(lada);
            list.add(bmw);
            list.add(audi);
            list.add(mers);
            list.add(geely);
            return list;
        } else {

            switch (count) {
                case 1:
                    list.add(lada);
                    break;
                case 2:
                    list.add(lada);
                    list.add(bmw);
                    break;
                case 3:
                    list.add(lada);
                    list.add(bmw);
                    list.add(audi);
                    break;
                case 4:
                    list.add(lada);
                    list.add(bmw);
                    list.add(audi);
                    list.add(mers);
                    break;
                default:
                    list.add(lada);
                    list.add(bmw);
                    list.add(audi);
                    list.add(mers);
                    list.add(geely);
                    break;
            }
        }

        return list;
    }
}
