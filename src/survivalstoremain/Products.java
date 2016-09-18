package survivalstoremain;

public class Products {
	
	private int id;
	private String category;
	private String name;
	private float price;
	private int num_in_stock;
	private int custId;
	private String lName;
	private String fName;
	private double walletTotal;
	

	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public double getWalletTotal() {
		return walletTotal;
	}


	public void setWalletTotal(double walletTotal) {
		this.walletTotal = walletTotal;
	}


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
		
		String str = String.format("%-2s%30s%60s%10.2f%15s", id, category, name, price, num_in_stock);
		return str;
	}
	
	
}

