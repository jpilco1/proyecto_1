package com.distribuida.principalDto;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.ProductosService;
import com.distribuida.entities.Productos;

public class PrincipalProductosDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ProductosService productosService = context.getBean("productosSeviceIml",ProductosService.class);
		
		
		//CRUD
		
		//ADD
		productosService.add(0, null, null, null, 0, null);
		
		//UP
		
		//productosService.up(0, null, null, null, 0, null);
		
		//	DEL
		//productosService.del(37);
		
		//findAll
		
		List<Productos> productos = productosService.findAll();
		
		
		
		
		//impresion
		for (Productos item : productos) {
			System.out.println(item.toString());
		}
		
		//findOne
		//Clientes cliente =clienteService.findOne(3);
		
		//System.out.println(cliente.toString());
		
		context.close();

	}

}
