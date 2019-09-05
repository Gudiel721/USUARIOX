package com.example.producto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Producto {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
	
@Column
private String nombre;

@Column
private String cantidad;


@Column
private String precio;


@Column
private String vencimiento;

@Column
private String categoria;

public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCantidad() {
	return cantidad;
}

public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}

public String getPrecio() {
	return precio;
}

public void setPrecio(String precio) {
	this.precio = precio;
}

public String getVencimiento() {
	return vencimiento;
}

public void setVencimiento(String vencimiento) {
	this.vencimiento = vencimiento;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}


}
