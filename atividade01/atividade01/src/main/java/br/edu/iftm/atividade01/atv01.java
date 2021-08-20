package br.edu.iftm.atividade01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class atv01 {

	@RequestMapping("/atividade")
	public String atv1() {
		return "home";
	}
}
