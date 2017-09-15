package br.com.mercadotiojoao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mercadotiojoao.domain.Produto;
import br.com.mercadotiojoao.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private Produtos produtos;
	
	@GetMapping
	public String listar() {
		return "lista-produtos";
	}
	
	@GetMapping("/novo")
	public String novo() {
		return "novo-produto";
	}
	
	@PostMapping
	public String salvar(Produto produto) {
		produtos.save(produto);
		return "novo-produto";
	}
}
