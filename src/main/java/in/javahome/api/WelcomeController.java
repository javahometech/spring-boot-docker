package in.javahome.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot! @Java Home";
	}

}