package com.projetoentra21.AppFii.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
//	@RequestMapping("/")
//	public ModelAndView home() {
//		ModelAndView mv = new ModelAndView("/home");
//		
//		Iterable<Fundo> fundos = fr.findAll();
//		mv.addObject("tfundos", fundos);
//		
//		return mv;	
//	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "cadastroUsuario";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "/appFii/dashboard";
	}
}
