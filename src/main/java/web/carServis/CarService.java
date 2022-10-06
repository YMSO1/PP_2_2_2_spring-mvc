package web.carServis;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsList(long count);
}
