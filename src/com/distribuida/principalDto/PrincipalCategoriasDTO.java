package com.distribuida.principalDto;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.CategoriasService;
import com.distribuida.entities.Categorias;

public class PrincipalCategoriasDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriasService categoriasService = context.getBean("categoriasServiceImpl",CategoriasService.class);
		
		
		//CRUD
		
		//ADD
		categoriasService.add(0, "verduras"," son buenas para la salud", "verdura.jpg");
		
		//UP
		
		//categoriasService.up(0, null, null, null);
		
		//	DEL
		//categoriasService.del(37);
		
		//findAll
		
		List<Categorias> categorias = categoriasService.findAll();
		
		
		
		
		//impresion
		for (Categorias item : categorias) {
			System.out.println(item.toString());
		}
		
		//findOne
		//Clientes cliente =clienteService.findOne(3);
		
		//System.out.println(cliente.toString());
		
		context.close();
	}

}
