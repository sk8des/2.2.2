package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;

@Controller
public class CarController extends CarServiceImpl {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }


    @GetMapping(value = "/cars")
    public String allCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("car", show(count));
        return "cars";
    }

}
