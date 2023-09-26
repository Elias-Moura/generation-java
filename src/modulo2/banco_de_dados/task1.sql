/* ATIVIDADE 01 */

-- 1.Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos colaboradores desta empresa.

CREATE DATABASE db_rh;
USE db_rh;

-- 2.Crie uma tabela de colaboradores e determine 5 atributos relevantes dos colaboradores para se trabalhar com o serviço deste RH.

CREATE TABLE tb_colaboradores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    data_contratacao DATE NOT NULL,
    salario DECIMAL(10, 2) NOT NULL,
    departamento VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE
);

-- 3.Insira nesta tabela no mínimo 5 dados (registros).

INSERT INTO tb_colaboradores (nome, cargo, data_contratacao, salario, departamento, email) VALUES
    ('João Silva', 'Analista de RH', '2022-01-15', 5000.00, 'Recursos Humanos', 'joao.silva@empresa.com'),
    ('Maria Santos', 'Gerente de Vendas', '2021-03-10', 7500.00, 'Vendas', 'maria.santos@empresa.com'),
    ('Pedro Oliveira', 'Desenvolvedor de Software', '2020-06-20', 6000.00, 'Tecnologia da Informação', 'pedro.oliveira@empresa.com'),
    ('Ana Rodrigues', 'Contadora', '2019-11-05', 6500.00, 'Finanças', 'ana.rodrigues@empresa.com'),
    ('Carlos Pereira', 'Analista de Marketing', '2020-08-30', 5500.00, 'Marketing', 'carlos.pereira@empresa.com');


-- 4.Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000.

SELECT * FROM tb_colaboradores WHERE salario > 2000;

-- 5.Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000.

SELECT * FROM tb_colaboradores WHERE salario < 2000;

-- 6.Ao término atualize um registro desta tabela através de uma query de atualização.

UPDATE tb_colaboradores SET salario = 5500.00 WHERE nome = 'João Silva';
