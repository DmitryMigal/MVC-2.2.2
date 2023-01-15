package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    List<Car> carlist (Integer count);
}
