package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String getListCar(@RequestParam("count") int count, Model model) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Camry", 2022, 28000));
		cars.add(new Car("Rav4", 2021, 32000));
		cars.add(new Car("Corolla", 2020, 22000));
		cars.add(new Car("Prado", 2024, 68000));
		cars.add(new Car("Vitz", 2018, 17000));
		CarService service = new CarServiseImpl();
		model.addAttribute("cars", service.refreshListCar(cars,count));
		return "/cars";
	}
}