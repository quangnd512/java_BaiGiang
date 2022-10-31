package TrainingSpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
	
	@RequestMapping("/test")
	public String Test() {
		return "test";
	}
}
