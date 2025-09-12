
create table peca(
	cod_peca int primary key not null auto_increment,
    nome_peca VARCHAR(20),
    cor_peca VARCHAR(10),
    cidade_peca VARCHAR(25)
);
create table fornecedor(
	cod_fornec int primary key not null auto_increment,
    nome_fornec VARCHAR(20),
    cidade_fornec VARCHAR(25)
);

create table embarque(
	cod_peca int, foreign key (cod_peca) references peca (cod_peca),
	cod_fornec int, foreign key (cod_fornec) references fornecedor (cod_fornec),
    qtde_peca int,
    dth_embarque DATETIME
);

create table empregado(
	cod_emp int primary key not null auto_increment,
    nome_emp varchar(20),
    cod_empGer int, foreign key (cod_empGer) references empregado(cod_emp)
);
-- preenchendo com dados

INSERT INTO peca (nome_peca, cor_peca, cidade_peca) VALUES 
('Parafuso', 'Prata', 'São Paulo'),
('Porca', 'Preto', 'São Paulo'),
('Arruela', 'Prata', 'Campinas'),
('Ajustador', 'Azul', 'São Paulo'),
('Rolo', 'Verde', 'Campinas'),
('Rolamento', 'Cinza', 'São José dos Campos'),
('Eixo', 'Preto', 'São Paulo'),
('Engrenagem', 'Amarelo', 'Campinas'),
('Cabo', 'Vermelho', 'São Paulo'),
('Chave', 'Roxo', 'São José dos Campos'),
('Engate', 'Laranja', 'Campinas'),
('Suporte', 'Branco', 'São Paulo'),
('Mola', 'Verde', 'São José dos Campos'),
('Pino', 'Prata', 'Campinas'),
('Roda', 'Preto', 'São Paulo'),
('Trava', 'Azul', 'São José dos Campos'),
('Pasta', 'Cinza', 'São Paulo'),
('Mangueira', 'Amarelo', 'São José dos Campos'),
('Ponteira', 'Rosa', 'Campinas'),
('Protetor', 'Vermelho', 'São Paulo');

INSERT INTO fornecedor (nome_fornec, cidade_fornec) VALUES 
('Fornecedor A', 'São Paulo'),
('Fornecedor B', 'Campinas'),
('Fornecedor C', 'São José dos Campos'),
('Fornecedor D', 'São Paulo'),
('Fornecedor E', 'Campinas');

INSERT INTO embarque (cod_peca, cod_fornec, qtde_peca, dth_embarque) VALUES 
(1, 1, 100, '2024-08-01 08:00:00'),
(2, 2, 200, '2024-08-01 09:00:00'),
(3, 3, 150, '2024-08-01 10:00:00'),
(4, 4, 80, '2024-08-01 11:00:00'),
(5, 5, 120, '2024-08-01 12:00:00'),
(6, 1, 90, '2024-08-02 08:00:00'),
(7, 2, 110, '2024-08-02 09:00:00'),
(8, 3, 140, '2024-08-02 10:00:00'),
(9, 4, 70, '2024-08-02 11:00:00'),
(10, 5, 130, '2024-08-02 12:00:00'),
(11, 1, 85, '2024-08-03 08:00:00'),
(12, 2, 190, '2024-08-03 09:00:00'),
(13, 3, 160, '2024-08-03 10:00:00'),
(14, 4, 75, '2024-08-03 11:00:00'),
(15, 5, 140, '2024-08-03 12:00:00'),
(16, 1, 100, '2024-08-04 08:00:00'),
(17, 2, 220, '2024-08-04 09:00:00'),
(18, 3, 180, '2024-08-04 10:00:00'),
(19, 4, 65, '2024-08-04 11:00:00'),
(20, 5, 150, '2024-08-04 12:00:00');

INSERT INTO empregado (nome_emp, cod_empGer) VALUES 
('Carlos Silva', NULL),
('Maria Oliveira', 1),
('João Pereira', 1),
('Ana Santos', 2),
('Pedro Costa', 2),
('Lucas Almeida', 3),
('Fernanda Souza', 3),
('Rafael Lima', 4),
('Juliana Costa', 4),
('Roberto Almeida', 5),
('Camila Ribeiro', 5),
('Felipe Martins', 6),
('Larissa Carvalho', 6),
('Gustavo Ferreira', 7),
('Tatiane Oliveira', 7),
('Renato Cruz', 8),
('Isabela Lima', 8),
('Ricardo Melo', 9),
('Patrícia Gomes', 9),
('Marcos Andrade', 10);
