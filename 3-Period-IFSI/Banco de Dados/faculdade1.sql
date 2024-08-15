select 
	distinct(nacionalidade) 
    as 'Nacionalidade Distintas' 
from aluno order by nacionalidade;

select count(*) from aluno;

select mac(totaulas) as 'Maior nº de aula' from curso where ano = '2016';

select min(totaulas) as 'Maior nº de aula' from curso where ano = '2018';

select sum(carga) from curso;

select sum(peso) from aluno where nacionalidade = 'Irlanda';	

select round(avg(peso), 2) as 'peso medio' from aluno;

select nome from curso where carga >= (select avg(carga) from curso);

select * from curso;

-- aula 15/08

select nome from aluno where cursopreferido in 
(select idcurso from curso where carga > 
(select avg(carga) from curso));


select nome from aluno where cursopreferido in
(select idcurso from curso where carga =
(select max(carga) from curso));

select * from curso;

select carga from curso group by carga;

select distinct(carga) from curso;

select nacionalidade, count(nacionalidade) as 'Quantidade' from aluno group by nacionalidade order by Quantidade;

select cursopreferido, count(nome) 
from aluno 
where nacionalidade = 'Brasil' 
group by cursopreferido;

select carga, count(nome) as 'Quantidade' from curso group by carga
having count(nome) > 3;

-- atividade
select profissao, count(profissao) as 'Quantidade' from aluno group by profissao order by Quantidade;

select sexo, count(sexo) as 'Quantidade' from aluno where nascimento > '2005-01-01' group by sexo order by sexo;

select nacionalidade, count(nacionalidade) as 'Quantidade' from aluno where nacionalidade != 'Brasil' group by nacionalidade having Quantidade > 3;