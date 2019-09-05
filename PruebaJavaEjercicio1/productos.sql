create database productos
use productos
create table producto(
id int not null Auto_increment primary key,
nombre Varchar(64) not null,
cantidad int not null ,
precio decimal(10,2) not null ,
vencimiento date not null,
categoria enum('Limpieza','Alimentos','Cosmeticos')
);