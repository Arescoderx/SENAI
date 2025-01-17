create database Crud;

create table cadastro(
	Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nome VARCHAR(45) NOT NULL,
    Sobrenome VARCHAR(45) NOT NULL,
    CPF VARCHAR(15) NOT NULL,
    Numero VARCHAR(20) NOT NULL
);
SELECT * FROM cadastro;
TRUNCATE cadastro;