package com.vinicius.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vinicius.model.Equacao;
import com.vinicius.regrasNegocios.Regras;

@Controller
@RequestMapping("/equacao")
public class EquacaoController {

	private static final String index ="equacao2grau";
	
	
	private Regras regra;
	
	
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
				ModelAndView mv = new ModelAndView(index);
		mv.addObject(new Equacao());
		return mv;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String calcular(@Validated Equacao e , Errors errors, RedirectAttributes attributes){
		
		if (errors.hasErrors()) {
			return index;
		}
		
		try {
		regra.resultado(e);
			return "redirect:/equacacao/novo";
			
		}catch(IllegalArgumentException er){
			errors.rejectValue(" valor_a", null,er.getMessage());
			return index;
		}
		
	}
	
	
	
}
