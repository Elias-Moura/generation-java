-- Atividade 2

-- Crie um banco de dados para um e-commerce, onde o sistema trabalhará com as informações dos produtos deste e-commerce.

CREATE DATABASE db_ml;
USE db_ml;

-- Crie uma tabela de produtos e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste e-commerce.

CREATE TABLE tb_produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL,
    estoque INT NOT NULL,
    categoria VARCHAR(100),
    avaliacao DECIMAL(3, 2),
    imagem_url VARCHAR(255),
    peso DECIMAL(5, 2),
    data_lancamento DATE
);

-- Insira nesta tabela no mínimo 8 dados (registros).

INSERT INTO tb_produtos (nome, descricao, preco, estoque, categoria, avaliacao, imagem_url, peso, data_lancamento) VALUES
    ('Smartphone Modelo A', 'Um smartphone de última geração com tela de alta resolução e câmera de 48 MP.', 799.99, 50, 'Eletrônicos', 4.5, 'imagem_url1', 0.3, '2023-01-15'),
    ('Laptop Modelo X', 'Um laptop poderoso com processador de última geração e SSD de 512 GB.', 1299.99, 30, 'Eletrônicos', 4.7, 'imagem_url2', 1.5, '2023-02-10'),
    ('Televisor 4K', 'Uma TV 4K de 55 polegadas com tecnologia de alta definição.', 699.99, 40, 'Eletrônicos', 4.3, 'imagem_url3', 18.0, '2023-03-20'),
    ('Fogão a Gás', 'Um fogão a gás com quatro queimadores e forno embutido.', 349.99, 20, 'Eletrodomésticos', 4.0, 'imagem_url4', 45.0, '2023-04-05'),
    ('Máquina de Lavar Roupas', 'Uma máquina de lavar roupas de carga frontal com capacidade de 8 kg.', 499.99, 25, 'Eletrodomésticos', 4.2, 'imagem_url5', 75.0, '2023-05-12'),
    ('Tênis de Corrida', 'Tênis de corrida com amortecimento avançado para atletas.', 79.99, 100, 'Calçados', 4.6, 'imagem_url6', 0.7, '2023-06-30'),
    ('Bicicleta de Montanha', 'Uma bicicleta de montanha resistente para trilhas radicais.', 899.99, 15, 'Esportes', 4.8, 'imagem_url7', 12.0, '2023-07-18'),
    ('Livro "Aventuras Espaciais"', 'Um livro de ficção científica sobre aventuras no espaço.', 19.99, 200, 'Livros', 4.4, 'imagem_url8', 0.5, '2023-08-25');

-- Faça um SELECT que retorne todes os produtos com o valor maior do que 500.

SELECT * FROM tb_produtos WHERE preco > 500;

-- Faça um SELECT que retorne todes os produtos com o valor menor do que 500.

SELECT * FROM tb_produtos WHERE preco < 500;