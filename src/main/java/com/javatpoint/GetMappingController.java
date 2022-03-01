package com.javatpoint;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetMappingController {
	
	@Autowired
	GetMappingService service;
	
	
	@GetMapping("/String")
	public String getString() {

		return "Spring boot project";
	}
	@GetMapping("/List")
	public List<String> getList(){
		List<String> list=Arrays.asList("item1","item2","item3");
		return list;
		
	}
	@GetMapping("/Object")
	public List<Item> getObject(){
		List<Item> itmList= Arrays.asList(
				new Item(1,"Washing machine",15000),
		        new Item(2,"Refrigerator",20000),
		        new Item(3,"laptop Dell",300));
		return itmList;

		}
	@GetMapping("/Object2")
	public List<Item> getObject2(){
		return service.getAllItems();
		
	}
	@GetMapping("/ObjectById/{id}")
	public List<Item> getObjectByid(@PathVariable int id){
		 return service.getItemById(id);
	}
	
}
