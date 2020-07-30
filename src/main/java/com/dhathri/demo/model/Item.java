package com.dhathri.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itemtable")
public class Item {
   
	@Override
	public String toString() {
		return "Item [id=" + id + ", bookname=" + bookname + ", itemName=" + itemName + ", price=" + price
				+ ", description=" + description + "]";
	}
	@Id
	public int id;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String bookname;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String itemName;
	public int price;
	public String description;
	
	public Item() {
		
	}
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
