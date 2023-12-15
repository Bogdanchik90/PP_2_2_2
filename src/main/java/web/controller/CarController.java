package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    public static void main(String[] args) {
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
    }


    @GetMapping("/cars")
    public String sayHelloParam(@RequestParam(value = "count", required = false) Integer count,
                                Model model) {

        CarServiceImpl carService = new CarServiceImpl();

        model.addAttribute("cars",carService.getCars(count));
        return "cars";
    }

}
