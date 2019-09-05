package com.example.producto.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.producto.model.Producto;

public interface ProductoDaoApi extends CrudRepository<Producto, Long> {

}
