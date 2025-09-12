-- 1
select * from embarque where qtde_peca between 5 and 10;

-- 2 
select * from embarque where qtde_peca != 100;

-- 3

-- 4
select peca.nome_peca from peca 
join embarque 
on peca.cod_peca = embarque.cod_peca and embarque.qtde_peca > 100;