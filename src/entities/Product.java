package entities;

public class Product implements Comparable<Product>{
	
	private String name;
	private Double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}	

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return name	+ ",  "	+ String.format("%.2f", price);
			
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
	
}
