create database DB_Pizzaria_legal;
use DB_Pizzaria_legal;

-- criando tabelas
create table tb_categorias(
id bigint auto_increment not null,
salgado varchar (50) not null,
doce varchar (50) not null,
vegana varchar (50),

primary key (id)
);

 create table tb_pizzas(
 id bigint auto_increment ,
 nome varchar (255) not null,
 tamanho varchar (255) not null,
 descricao varchar(255) not null,
 sabor varchar (255) not null,
 quantidade int (15) not null,
 valor float (10.2) not null,
 categoria_id bigint not null,
 
 primary key (id),
 foreign key (categoria_id) references tb_categorias (id)
 );
  -- Verificado integridades das tabelas
 select * from tb_categorias;
  -- Inserindo valores na Tabela Categoria
  insert into tb_categorias(salgado,doce,vegana)
  values("Calabresa","Morango com chocolate","Brócolis com Catupiry");
  
   insert into tb_categorias(salgado,doce,vegana)
  values("Marguerita","Coco com chocolate"," Pizza de Milho Verde");
  
  insert into tb_categorias(salgado,doce,vegana)
  values("Napolitana","Creme de Avelã com chocolate"," Palmito");
  
  insert into tb_categorias(salgado,doce,vegana)
  values("Portuguêsa","Banofe"," Vegetariana");
  
  insert into tb_categorias(salgado,doce,vegana)
  values("Franco com Catupiry","Banana"," Quatro Queijos");
  
  select * from tb_pizzas;
  -- Inserindo valores na Tabaela Pizza
  insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Calabresa","Brotinho","muçarela, calabresa e cebola","Salgado",2,29.99,1);
  
  insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Portuguêsa","Pequena","presunto, ovos, muçarela e ervilha","Salgado",4,59.99,2);
  
   insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Maguerita","Familiar","molho, muçarela, tomate e manjericão","Salgado",12,60.00,2);
  
   insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Quatro Queijo","Familiar","muçarela, catupiry, provolone e parmesão","Salgado",12,49.99,3);
  
  insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Palmito","Media","Palmito com Requeijão","Vegana",6,39.99,3);
  
  insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Alcachofrinha","Pequena","muçarela de búfala, corações de alcachofra e azeitonas fatiadas","Vegana",4,29.99,3);
  
  
  insert into tb_pizzas(nome,tamanho,descricao,sabor,quantidade,valor,categoria_id)
  values("Oreo","Familiar","Chocolate branco com biscoitos Oreo salpicado","Doce",4,29.00,1);
  
  
   
  
  
    
select * from tb_pizzas where valor > 45;
select * from tb_pizzas where valor between 29 and 60;
select *from tb_pizzas where calabresa like "%c%";

select * from tb_pizzas
inner join categoria_id on categoria_id = tb_categoria.grande;


select * from tb_pizzas where valor > 45;
select * from tb_pizzas where valor between 29 and 60;
-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizzas where nome like "%c%";


-- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_pizzas inner join tb_categorias
on tb_pizzas.id = tb_categorias.id;
-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são pizza doce)


select * from tb_pizzas inn join tb_categorias where
tb_categorias.doce = tb_categorias.doce;













 
 
 
 
 