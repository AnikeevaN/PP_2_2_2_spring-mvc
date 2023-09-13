package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(int number) {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Red", "Mazda", 111));
        allCars.add(new Car("Green", "Renault", 222));
        allCars.add(new Car("Blue", "BMW", 333));
        allCars.add(new Car("White", "Mercedes", 444));
        allCars.add(new Car("Black", "Audi", 555));
        return allCars.stream().limit(number).collect(Collectors.toList());
    }
}