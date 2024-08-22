-- 1
select cliente.nome, veiculo.placa from cliente
 join veiculo on cliente.cpf = veiculo.cliente_cpf;

-- 2
select cliente.nome, cliente.cpf from cliente 
inner join veiculo 
on veiculo.placa = 'JJJ-2020' and cliente.cpf = veiculo.cliente_cpf;

-- 3
select veiculo.placa, veiculo.cor, estaciona.patio_num as 'Patio' from veiculo 
inner join estaciona on estaciona.patio_num = 1 and veiculo.placa = estaciona.veiculo_placa;

-- 4
select estaciona.dtEntrada, estaciona.dtSaida, patio.ender 
from estaciona 
inner join veiculo inner join patio 
on veiculo.placa = 'JEG-1010' and veiculo.placa = estaciona.veiculo_placa;

-- 5
select count(veiculo.cor) as "Qtde" from veiculo join estaciona on veiculo.cor = "Branco" and estaciona.veiculo_placa = veiculo.placa;

-- 6 
select cliente.nome from cliente inner join veiculo on veiculo.modelo_codMod = 1 and cliente.cpf = veiculo.cliente_cpf;

-- 7
select cliente.nome from cliente 
inner join veiculo on veiculo .placa 
in (select veiculo.placa from veiculo inner join patio on patio.num = 2);

-- 8
select cliente.nome, veiculo.placa, modelo.desc_2 from cliente 
join veiculo join modelo 
on cliente.cpf = veiculo.cliente_cpf and veiculo.modelo_codMod = modelo.codMod  
order by cliente.nome;

-- 9
select cliente.nome, veiculo.placa, modelo.desc_2, estaciona.dtEntrada, estaciona.dtSaida, estaciona.patio_num, patio.ender
from cliente join veiculo join modelo join estaciona join patio
on (modelo.desc_2 = 'HB20' or modelo.desc_2 = 'Corola')
and cliente.cpf = veiculo.cliente_cpf and veiculo.modelo_codMod = modelo.codMod 
and veiculo.placa = estaciona.veiculo_placa and patio.num = estaciona.patio_num;
 
-- 10
select cliente.nome, cliente.cpf from cliente 
join estaciona join veiculo
 on estaciona.patio_num = 3 and veiculo.placa = estaciona.veiculo_placa and cliente.cpf = veiculo.cliente_cpf;
