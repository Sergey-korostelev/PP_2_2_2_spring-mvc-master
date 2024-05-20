package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServise;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
	public final CarServise servise;

	public HelloController(CarServise servise) {
		this.servise = servise;
	}

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
		final int countt = count;
		model.addAttribute("cars", servise.refreshListCar(countt));
		return "/cars";
	}
}