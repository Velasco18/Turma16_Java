create database Zara;
use Zara;

create table Produtos(
id bigint auto_increment,
nome varchar(255) not null,
cor varchar(50) not null,
tamanho char(50) not null,
valor float (50) not null,
primary key(id)
);
select * from Produtos;

insert into Produtos(nome, cor, tamanho, valor )
values (" Camisa ", " Branco", 'XXL', 100);

insert into Produtos(nome, cor, tamanho, valor )
values (" Calção ", " Branco", 'P', 259);

insert into Produtos(nome, cor, tamanho, valor )
values (" boxer ", " Preto", 'M', 29);

insert into Produtos(nome, cor, tamanho, valor )
values (" perfume ", " black", '200ml', 160);

insert into Produtos(nome, cor, tamanho, valor )
values (" Bota ", " Castanho", '39', 300);

insert into Produtos(nome, cor, tamanho, valor )
values (" Sapato ", " Preto", '42', 250);

insert into Produtos(nome, cor, tamanho, valor )
values (" Meia ", " Branco", 'M', 30);

insert into Produtos(nome, cor, tamanho, valor )
values (" Casaco ", " Azul", 'G', 500);

update Produtos set valor =2000 where id =1;
update Produtos set valor =2000 where id =2;
update Produtos set valor =2000 where id =5;

select * from Produtos  where valor > 500;
select * from Produtos  where valor < 500;

update produtos set valor =180 where id=6;

