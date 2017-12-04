package br.com.codawer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String irParaHome() {
		System.out.println("work!");
		return "index";
	}
}
