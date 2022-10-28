
public class Pizza {
	private String description;
	private double price;
	
	public void pizza(String desc, double pr) {
		this.description = desc;
		this.price = pr;
	}
	
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	
	public void display() {
		System.out.print(getDescription());
		System.out.print(getPrice());
	}
	
}
