/*
Atividade 3

Crie um banco de dados para um serviço de uma Farmácia.
O nome do Banco de dados deverá ter o seguinte nome db_farmacia_bem_estar.
O sistema trabalhará com as informações dos produtos comercializados pela empresa.
O sistema trabalhará com 2 tabelas tb_produtos e tb_categorias, que deverão estar relacionadas.
*/


create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;

-- 1 Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os produtos.

create table tb_categorias  (
id int auto_increment primary key,
nome char(100),
descricao char(100)
);

-- 2 Crie a tabela tb_produtos e determine 4 atributos, além da Chave Primária, relevantes aos produtos da farmácia.
-- 3 Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_produtos.

create table tb_produtos (
    id int auto_increment primary key,
    nome varchar(100),
    preco decimal(10, 2),
    estoque int,
    validade date,
    id_categoria int,
    foreign key (id_categoria) references tb_categorias(id)
);


-- 5 Insira 5 registros na tabela tb_categorias.

insert into tb_categorias (nome, descricao) values
('Medicamentos', 'Medicamentos de prescrição médica'),
('Higiene Pessoal', 'Produtos para higiene pessoal'),
('Cosméticos', 'Produtos cosméticos'),
('Primeiros Socorros', 'Itens de primeiros socorros'),
('Suplementos', 'Suplementos alimentares');


-- 6 Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.

insert into tb_produtos (nome, preco, estoque, validade, id_categoria) values
('Paracetamol 500mg', 5.99, 100, '2024-12-31', 1),
('Shampoo Suave', 7.49, 50, '2024-12-31', 2),
('Batom Vermelho', 19.90, 50, '2024-12-31', 3),
('Curativos Adesivos', 3.99, 200, '2024-12-31', 4),
('Whey Protein', 89.90, 20, '2024-12-31', 5),
('Aspirina 500mg', 6.89, 100, '2024-12-31', 1),
('Condicionador Suave', 7.49, 50, '2024-12-31', 2),
('Máscara Facial', 14.90, 30, '2024-12-31', 3);

-- 6 Faça um SELECT que retorne todes os produtos cujo valor seja maior do que R$ 50,00.

select * from tb_produtos where preco > 50;

-- 7 Faça um SELECT que retorne todes os produtos cujo valor esteja no intervalo R$ 5,00 e R$ 60,00.

select * from tb_produtos where preco between 5 and 60;

-- 8 Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.

select * from tb_produtos where nome like '%c%';

-- 9 Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.

select * from tb_produtos inner join tb_categorias on tb_produtos.id_categoria = tb_categorias.id;

-- 10 Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias,
-- onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria cosméticos).

select * from tb_produtos inner join tb_categorias on tb_produtos.id_categoria = tb_categorias.id
WHERE tb_categorias.id = 1;