package br.com.mercadotiojoao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

	Long id;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
