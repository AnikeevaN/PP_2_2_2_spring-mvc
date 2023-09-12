package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService){
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String viewCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {

        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Red","Mazda",111));
        allCars.add(new Car("Green","Renault",222));
        allCars.add(new Car("Blue","BMW",333));
        allCars.add(new Car("White","Mercedes",444));
        allCars.add(new Car("Black","Audi",555));

        List<Car> cars = carService.getCarsList(allCars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
