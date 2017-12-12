package Intermediate;

public class Paint {
	private String name;
	private int weight;
	private double price;
	private int area;
	
	public Paint(String name, int weight, double price, int area) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public int getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", weight=" + weight + ", price=" + price + ", area=" + area + "]";
	}
	
	
	
}
