package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/gagan")
	public String display() {
		return "index"; 
	}

}
