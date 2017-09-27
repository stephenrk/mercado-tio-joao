package br.com.mercadotiojoao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mercadotiojoao.domain.Produto;
import br.com.mercadotiojoao.repository.ProdutosRepository;

@Service
public class ProdutosService {

	@Autowired
	private ProdutosRepository produtosRepository;
	
	public List<Produto> listar() {
		return produtosRepository.findAll();
	}

	public void salvar(Produto produto) {
		produtosRepository.save(produto);
	}

}
