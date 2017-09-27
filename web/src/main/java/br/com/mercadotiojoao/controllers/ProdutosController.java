package br.com.mercadotiojoao.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mercadotiojoao.domain.Produto;
import br.com.mercadotiojoao.services.ProdutosService;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private ProdutosService produtosService;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mav = new ModelAndView("lista-produtos");
		List<Produto> produtos = produtosService.listar();
		mav.addObject("produtos", produtos);
		return mav;
	}
	
	@GetMapping("/novo")
	public String novo() {
		return "novo-produto";
	}
	
	@PostMapping
	public String salvar(@Valid @RequestBody Produto produto) {
		produtosService.salvar(produto);
		return "novo-produto";
	}
}
