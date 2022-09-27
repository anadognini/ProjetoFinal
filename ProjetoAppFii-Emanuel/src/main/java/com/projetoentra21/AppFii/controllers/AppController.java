package com.projetoentra21.AppFii.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.projetoentra21.AppFii.models.Fundo;
import com.projetoentra21.AppFii.models.Usuario;
import com.projetoentra21.AppFii.repository.FundoRepository;
import com.projetoentra21.AppFii.repository.UsuarioRepository;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private FundoRepository fr;
	
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
	
	@RequestMapping("/login")
	public String login() {
		return "login";
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
