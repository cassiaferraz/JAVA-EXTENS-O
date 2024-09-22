package com.projeto.sistema.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {

	@GetMapping("/administraivo")
	public String acessarPrincipal() {
		return "administrativo/home";
	}
	
}
