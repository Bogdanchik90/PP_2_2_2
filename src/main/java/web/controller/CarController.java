package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarServiceImpl;


@Controller
public class CarController {



    @GetMapping("/cars")
    public String sayHelloParam(@RequestParam(value = "count", required = false) Integer count,
                                Model model) {

        CarServiceImpl carService = new CarServiceImpl(new CarDaoImpl());

        model.addAttribute("cars",carService.getCars(count));
        return "cars";
    }

}
