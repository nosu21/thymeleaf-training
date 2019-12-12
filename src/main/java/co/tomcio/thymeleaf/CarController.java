package co.tomcio.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping("/car")
    public String getCar(Model model) {

        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Polonez", "Caro");
        Car car4 = new Car("Hyundai", "i30");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);



        model.addAttribute("name", "Tomcio");
        model.addAttribute("cars", carList);

        return "car";
    }
}
