package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostMappingService {
	
	public static List<Item> loadItemsFromDb(){
		List<Item> itmObject=new ArrayList<Item>();
		itmObject.add(new Item(1,"Washing machine",15000));
        itmObject.add(new Item(2,"Refrigerator",20000));
        itmObject.add(new Item(3,"Laptop Dell",35000));
        return itmObject;
		
	}
	public List<Item> items= loadItemsFromDb();;
	
	   List<Item> getAllItems () {
			return items;
	}

	
	public String addItems(Item item)
	{
		//items.add(new Item(item));
		  items.add(item);
		return "item added successfully";
	}


	public String updateItems(Item item) {
		// TODO Auto-generated method stub
		boolean resourceFound=false;
		for(Item currentItem:items) {
			if(currentItem.getItemNo()==item.getItemNo()) {
				resourceFound=true;
				currentItem.setItemNo(item.getItemNo());
				currentItem.setItemDesc(item.getItemDesc());
                currentItem.setItemprice(item.getItemprice());

			}
		}
		if(!resourceFound) {
			items.add(item);
			return "Item added sucessfully";
		}
		
		
		return "item updated sucessfully";
	}


	public String deleteItem(Item item) {
	   items.remove(item);
	   return "item deleted";
		
	}
}


