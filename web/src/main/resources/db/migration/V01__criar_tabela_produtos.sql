CREATE TABLE produtos (
	id SERIAL primary key,
	nome varchar(20),
	descricao varchar(500)
);

INSERT INTO produtos (nome, descricao) VALUES ('Suco de uva', '');
INSERT INTO produtos (nome, descricao) VALUES ('Pão na chapa', '');
INSERT INTO produtos (nome, descricao) VALUES ('teste3', '');