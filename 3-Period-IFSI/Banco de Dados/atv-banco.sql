-- 1
create database compra;
use compra;

create table cliente(
	idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR (100)
);

create table pedido(
	idPedido INT PRIMARY KEY AUTO_INCREMENT,
    dataPedido date,
    valor DECIMAL (10, 2)
);
-- 2
alter table cliente add telefone int (11);
alter table pedido add statusPedido varchar(20);

-- 3
alter table cliente
change telefone telefone INTEGER (20);

-- 4
alter table cliente
change telefone telefone_pedido INTEGER (20);

-- 5
alter table pedido drop statusPedido;

-- 6
alter table cliente rename to cliente_info;