-- 1
select cliente.nome, veiculo.placa from cliente join veiculo order by cliente.nome;

-- 2
select cliente.nome, cliente.cpf from cliente inner join veiculo on veiculo.placa = 'JJJ-2020';

-- 3
select veiculo.placa, veiculo.cor, patio.num as 'Patio' from veiculo inner join patio on patio.num = 1;

-- 4
select estaciona.dtEntrada, estaciona.dtSaida, patio.ender 
from estaciona 
inner join veiculo inner join patio 
on veiculo.placa = 'JEG-1010';

-- 5

select count(veiculo.cor) as "Qtde" from veiculo join estaciona on veiculo.cor = "Branco";

-- 6 
select cliente.nome from cliente inner join veiculo on veiculo.modelo_codMod = 1;

-- 7
select cliente.nome from cliente inner join veiculo on veiculo .placa in (select veiculo.placa from veiculo inner join patio on patio.num = 2);
