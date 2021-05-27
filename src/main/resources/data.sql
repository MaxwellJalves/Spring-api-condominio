create schema condominio;

CREATE TABLE IF NOT EXISTS usuario(
id INTEGER  PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR(250),
EMAIL VARCHAR(250),
TELEFONE VARCHAR(20),
SENHA VARCHAR(250)
);


insert into usuario(nome,email,senha,telefone) values('admin','maxwell@gmail.com','123456','90909090');
insert into usuario(nome,email,senha,telefone) values('jose','jose@gmail.com','123456','90909090');
insert into usuario(nome,email,senha,telefone) values('maria','maria@gmail.com','123456','90909090');
insert into usuario(nome,email,senha,telefone) values('seinao','seinao@gmail.com','123456','90909090');