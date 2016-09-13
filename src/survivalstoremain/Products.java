package survivalstoremain;

import java.io.PrintStream;

public class Products {
	
	private int id;
	private String category;
	private String name;
	private float price;
	private int num_in_stock;
	

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public int getNum_in_stock() {
		return num_in_stock;
	}



	public void setNum_in_stock(int num_in_stock) {
		this.num_in_stock = num_in_stock;
	}
	
	public String toString(){
		
		//String str = id + category + name + price + num_in_stock;
		
		String str = String.format("%-2s%30s%60s%10s%15s", id, category, name, price, num_in_stock);
				
		//System.out.printf("%2s", id + category);
			
		return str;
	}
	
	
}

