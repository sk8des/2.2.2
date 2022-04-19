package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    //Initialization block
    {
        carList = new ArrayList<>();
        carList.add(new Car("Ford", "Fiesta", 2019));
        carList.add(new Car("Mercedes", "GLE-class", 2012));
        carList.add(new Car("Renault", "Logan", 2011));
        carList.add(new Car("Peugeot", "308", 2018));
        carList.add(new Car("Lada", "Granta", 2021));
    }

    @Override
    public List<Car> show(int count){
        return (count == 0 || count > 5) ? carList : carList.stream().limit(count).collect(Collectors.toList());
    }
}
