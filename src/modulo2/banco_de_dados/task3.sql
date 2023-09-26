-- Atividade 3

-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola.

CREATE DATABASE db_escola;
USE db_escola;

-- Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.

CREATE TABLE tb_estudantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    genero ENUM('Masculino', 'Feminino', 'Outro') NOT NULL,
    endereco VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    nota DECIMAL(5,2)
);

-- Insira nesta tabela no mínimo 8 dados (registros).

INSERT INTO tb_estudantes (nome, data_nascimento, genero, endereco, email, nota) VALUES
    ('Maria Silva', '2005-03-10', 'Feminino', 'Rua das Flores, 123', 'maria.silva@email.com', 10.00),
    ('João Santos', '2004-05-15', 'Masculino', 'Avenida Principal, 456', 'joao.santos@email.com', 7.50),
    ('Ana Oliveira', '2006-02-20', 'Feminino', 'Travessa da Escola, 789', 'ana.oliveira@email.com', 3.40),
    ('Pedro Rodrigues', '2005-09-05', 'Masculino', 'Rua das Árvores, 567', 'pedro.rodrigues@email.com', 5.90),
    ('Carla Souza', '2004-11-18', 'Feminino', 'Rua da Amizade, 234', 'carla.souza@email.com', 4.40),
    ('Lucas Ferreira', '2006-01-30', 'Masculino', 'Avenida da Juventude, 789', 'lucas.ferreira@email.com' ,9.20),
    ('Mariana Lima', '2004-07-12', 'Feminino', 'Rua da Liberdade, 345', 'mariana.lima@email.com', 2.80),
    ('Rafaela Pereira', '2005-12-08', 'Feminino', 'Rua das Estrelas, 678', 'rafaela.pereira@email.com', 7.60);

-- Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0.

SELECT * FROM tb_estudantes WHERE nota > 7.0;

-- Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0.

SELECT * FROM tb_estudantes WHERE nota < 7.0;
