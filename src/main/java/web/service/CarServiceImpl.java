package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(List<Car> cars, int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}