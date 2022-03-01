package com.javatpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class GetMappingService {
	
   public List<Item> getAllItems(){
          List<Item> itmObject = new ArrayList<Item>();
          itmObject.add(new Item(1,"Washing machine",15000));
          itmObject.add(new Item(2,"Refrigerator",20000));
          itmObject.add(new Item(3,"Laptop Dell",35000));
        return itmObject;
 }

	public List<Item> getItemById(int id) {
		// TODO Auto-generated method stub
		 return getAllItems().stream().filter(item -> item.getItemNo()==id)
				 .collect(Collectors.toList());
	}

	}
