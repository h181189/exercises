package no.hib.h181189.exercise6;

public class Ware {
	
	private String name;
	private double price;
	private int wareNumber;
	
	public Ware() {
		name = "untitled";
		price = 0;
		wareNumber = -1;
	}
	
	public Ware(String name, double price, int wareNumber) {
		this.name = name;
		this.price = price;
		this.wareNumber = wareNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getWareNumber() {
		return wareNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setWareNumber(int wareNumber) {
		this.wareNumber = wareNumber;
	}
	
	public double tax() {
		return price * 0.2;
	}
	
	public boolean cheaperThan(Ware w) {
		return getPrice() < w.getPrice();
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Ware number: " + wareNumber);
	}
	
}
