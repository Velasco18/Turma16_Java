-- Criando Banco
create database Senac;
use Senac;
-- Criando Tabaela
create table Alunos(
id_Matricula bigint auto_increment,
nome varchar(255) not null,
cpf numeric (50) not null,
curso varchar (255) not null,
nota float (50) not null,
primary key (id_Matricula)
);
alter table Alunos
add sexo char(20);
select *from Alunos;
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Athos Mesquita",11223344556,"Programação",7,"EAD",'M');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Osvaldo Velasco",22334455661,"Programação",8,"EAD",'M');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Maria Nazaré",33445566772,"Programação",9,"EAD",'F');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Carolina Guida",44556677883,"Programação",10,"EAD",'F');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Andressa Ferreira",55667788994,"Programação",7,"EAD",'F');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Candido Cavaleiro",66778899105,"HTML",7,"EAD",'M');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Pedro Manuel",77889966556,"HTML",10,"Presencial",'M');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Crisostomo Pintal",88991010667,"Progrmação",6,"Presencial",'M');
insert into Alunos(nome,cpf,curso,nota,turma,sexo)
values("Paola Alencar",99101055668,"Progrmação",5,"EAD",'F');

select * From Alunos;
-- Selecionao Alunos com nota maior que 7
select * From Alunos where nota > 7;
-- Selecionando Alunos com nota menor que 7
select * From Alunos where nota < 7;

update Alunos set nota = 10 where id_Matricula =9;
update Alunos set nome = "Gustavo Lima", nota = 4 where id_Matricula = 7;







