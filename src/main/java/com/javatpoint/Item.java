package com.javatpoint;

public class Item {
	private int itemNo;
	private String itemDesc;
	private float itemprice;
	
	public Item(int itemNo, String itemDesc, float itemp) {
		super();
		this.itemNo = itemNo;
		this.itemDesc = itemDesc;
		this.itemprice = itemp;
	}

	public int getItemNo() {
		return itemNo;
	}


	public void setItemNo( int item) {
		this.itemNo = item;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public float getItemprice() {
		return itemprice;
	}

	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}		
}
