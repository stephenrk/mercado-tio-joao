package br.com.mercadotiojoao.repository;

import br.com.mercadotiojoao.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {

}
