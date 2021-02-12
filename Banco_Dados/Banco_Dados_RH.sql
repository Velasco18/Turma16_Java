-- Criando Bando de Dados
create database RH_Generation;
use RH_Generation;
-- Criando tabela 
create table Funcionarios(
id bigint auto_increment,
nome varchar(255)not null,
idade int not null,
cpf numeric(50) not null,
salario float not null,
primary key (id)
);
select *from Funcionarios;
-- inserindo dados na tabela
insert into Funcionarios(nome,idade,cpf,salario) values("Edinilson Nascimento",47,00000000000,10.000);
insert into Funcionarios(nome,idade,cpf,salario) values("Rafael Marangoni",30,11111111111,10000);
insert into Funcionarios(nome,idade,cpf,salario) values("Lucas Capelotto",29,2222222222,15000);
insert into Funcionarios(nome,idade,cpf,salario) values("Miguel Azevedo",32,3333333333,1000);
insert into Funcionarios(nome,idade,cpf,salario) values("Tatiana Aleixo",27,4444444444,20000);

-- Pesquisando Funciorarios com salario maior que 2000
select * from Funcionarios where salario >2000;
-- Pesquisando Funciorarios com salario menor que 2000
select * from Funcionarios where salario <2000;
-- Atualizando salário do Funcionario com menor salario
update Funcionarios set salario =3000 where id =4;






