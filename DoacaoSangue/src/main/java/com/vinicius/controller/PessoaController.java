package com.vinicius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vinicius.model.Pessoa;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	private static final String CADASTRO_VIEW = "CadastroPessoa";
	
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject(new Pessoa());
		return mv;
	}
	
}
