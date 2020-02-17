package br.com.deab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.deab.model.Aluno;
import br.com.deab.repository.AlunoRepository;

@Controller
@RequestMapping("aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ModelAndView abrePagina() {
		ModelAndView mv = new ModelAndView("aluno");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@PostMapping
	public ModelAndView salvar(Aluno aluno) {
		ModelAndView mv = new ModelAndView("aluno");
		repository.save(aluno);
		return mv;
	}
}
