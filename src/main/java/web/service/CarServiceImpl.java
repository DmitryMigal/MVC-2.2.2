package web.service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Crown", "Toyota", 280));
        carList.add(new Car("M5", "BMW", 340));
        carList.add(new Car("S600", "Mercedes", 380));
        carList.add(new Car("Vesta", "Lada", 102));
        carList.add(new Car("Rio", "Kia", 140));
    }

    @Override
    public List<Car> carlist(Integer count) {
        if ((count > 0 && count < 5)) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }

    }
}
