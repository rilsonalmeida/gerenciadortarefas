package br.com.treinaweb.twgerenciadortarefas.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public ModelAndView home(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String emailUsuario = request.getUserPrincipal().getName();	
		mv.setViewName("home/home");
		mv.addObject("emailSessao", emailUsuario);
		String msgHello = "Olá, " + emailUsuario + "! Seja bem-vindo ao Gerenciador de Tarefas";
		mv.addObject("mensagem", msgHello);		
		return mv;
	}
	
}
