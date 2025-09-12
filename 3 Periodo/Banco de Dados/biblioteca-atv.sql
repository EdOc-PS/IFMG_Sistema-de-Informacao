SELECT * from OBRA where TITULO LIKE '%R' ORDER BY ID_GENERO;

SELECT * from editora where NOME_FANTASIA LIKE '%Novo%';

SELECT * from OBRA where NR_OBRA > 4;

SELECT * from usuario where (2023 - year(DATA_NASCIMENTO))  >= 38;

SELECT nome, ENDERECO from usuario where (year(DATA_NASCIMENTO))  >= 1980 and (year(DATA_NASCIMENTO))  <= 1990; 

-- ativiadade
select * from LIVRO where year(DATA_AQUISICAO) = '2024' and NR_OBRA <=5;

select * from LIVRO where DATA_AQUISICAO >= '2024-01-15';

select * from OBRA where TITULO LIKE '%Senhor%';

select * from AUTOR where NOME LIKE '%King%' and ID_AUTOR <= 5;

select * from OBRA where ID_GENERO = 'FIC' or ID_GENERO = 'ROM';

select * from USUARIO where NOME like '%a%';

select * from MOVIMENTACAO where DATA_EMPRESTIMO between '2024-07-01' and '2024-07-15';

select * from GENERO where ID_GENERO 