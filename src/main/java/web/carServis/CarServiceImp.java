package web.carServis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Audi", "A6", 2001));
        cars.add(new Car("Hyundai", "Solaris", 2022));
        cars.add(new Car("Audi", "Q7", 2017));
        cars.add(new Car("Ford", "Maverick", 2005));
        cars.add(new Car("Jaguar", "XE", 2015));
    }

    @Override
    public List<Car> getCarsList(long count) {
        return cars.stream().limit(count).toList();
    }
}
