package com.javatpoint;

import java.util.List;
//import org.springframework.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/post")
public class PostMappingController {

	@Autowired
	PostMappingService service;
	
	@GetMapping("/getAllItems")
	public List<Item> getAllItems(){

		return service.getAllItems();
	}

	@PostMapping("/addItem")
	@ResponseStatus(code= HttpStatus.CREATED)
	public String addItems(@RequestBody Item item) {
		return service.addItems(item);
	}

	@PutMapping("/updateItem{id}")
	public String updateItems(@RequestBody Item item) {
		return service.updateItems(item);
	}
	
	@DeleteMapping("/deleteItem/{id}")
	public String deleteItem(@RequestBody Item item) {
		return service.deleteItem(item);
		
	}
	
	}
