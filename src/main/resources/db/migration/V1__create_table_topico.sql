create table TOPICO(
  ID int not null primary key auto_increment,
  TITULO varchar(100) not null unique,
  MENSAGEM text not null unique,
  DATA_CRIACAO date not null,
  STATUS varchar(100),
  AUTOR varchar(100),
  CURSO varchar(100)
);