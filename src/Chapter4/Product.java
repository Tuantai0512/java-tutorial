package Chapter4;

public class Product {

	private String name;
	private double price;
	private double tax;

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return this.price;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void nhapThongTin(String name, double price) {

	};

	public void xuatThongTin() {

	};

	public double getTaxPrice() {
		return price * tax;
	}

}
