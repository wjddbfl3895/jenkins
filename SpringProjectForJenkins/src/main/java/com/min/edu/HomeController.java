package com.min.edu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String home(Model model) {
		System.out.println("안녕하세요 CI/CD 교육중입니다.");
		return "home";
	}
}
