package com.vinicius.sangue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vinicius.sangue.bean.Doador;
import com.vinicius.sangue.daoImplements.DoadorDaoImplements;

@Controller
@RequestMapping("/doador")
public class DoadorController {

	private static String Cadastro_View="doadorCadastro";
	
	@Autowired
	private DoadorDaoImplements dao;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView(Cadastro_View);
		mv.addObject(new Doador());
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(@Validated Doador doador,Errors errors,RedirectAttributes attributes){
		if(errors.hasErrors()){
			return Cadastro_View;
			
		}
		
		try {
			dao.salvar(doador);
			attributes.addFlashAttribute("mensagem", "Doador salvo com sucesso");
			return "redirect:/doador/novo ";
		} catch (IllegalArgumentException e) {
			errors.rejectValue("sangue", null, e.getMessage());
			return Cadastro_View;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
