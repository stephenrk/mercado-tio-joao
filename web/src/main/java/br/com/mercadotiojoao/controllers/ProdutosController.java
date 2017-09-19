package br.com.mercadotiojoao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mercadotiojoao.domain.Produto;
import br.com.mercadotiojoao.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private Produtos produtosRepository;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mav = new ModelAndView("lista-produtos");
		List<Produto> produtos = produtosRepository.findAll();
		mav.addObject("produtos", produtos);
		return mav;
	}
	
	@GetMapping("/novo")
	public String novo() {
		return "novo-produto";
	}
	
	@PostMapping
	public String salvar(Produto produto) {
		produtosRepository.save(produto);
		return "novo-produto";
	}
}
