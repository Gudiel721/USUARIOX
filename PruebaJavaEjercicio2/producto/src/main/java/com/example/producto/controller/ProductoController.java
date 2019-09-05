package com.example.producto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.producto.model.Producto;
import com.example.producto.service.api.ProductoServiceApi;

@Controller
public class ProductoController {

	
	@Autowired
	private ProductoServiceApi ProductoServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",ProductoServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id,Model model) {
		if(id!=null && id !=0) {
			model.addAttribute("producto",ProductoServiceApi.get(id));
		}else {
			model.addAttribute("producto", new Producto());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Producto producto,Model model) {
		ProductoServiceApi.save(producto);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id,Model model) {
		ProductoServiceApi.delete(id);
		return "redirect:/";
	}

}
