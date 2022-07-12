package jana60.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

	@GetMapping("/home")
	public String saluto() {
		return "home";
	}

	@GetMapping("/ora")
	public String orario(Model model) {
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dataFormattata = data.format(formatter);
		model.addAttribute("data", dataFormattata);
		return "ora";
	}
}
