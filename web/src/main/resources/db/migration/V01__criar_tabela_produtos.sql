CREATE TABLE produtos (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome varchar(20),
	descricao varchar(500)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO produtos (nome, descricao) VALUES ('Suco de uva', '');
INSERT INTO produtos (nome, descricao) VALUES ('Pão na chapa', '');
INSERT INTO produtos (nome, descricao) VALUES ('teste3', '');