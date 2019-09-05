package com.example.producto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.producto.Commons.GenericServiceImpl;
import com.example.producto.dao.api.ProductoDaoApi;
import com.example.producto.model.Producto;
import com.example.producto.service.api.ProductoServiceApi;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Long> implements ProductoServiceApi {
   
	@Autowired
	private ProductoDaoApi ProductoDaoApi;


	@Override
	public CrudRepository<Producto, Long> getDao() {
		
		return ProductoDaoApi;
	}

}
