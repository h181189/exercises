package no.hib.h181189.exercise7;

import no.hib.h181189.exercise6.Ware;

public class WareTable {
	
	private final Ware[] wares;
	private int numberOfWares;
	
	private double totalPrice = 0;
	
	public WareTable(int capacity) {
		wares = new Ware[capacity];
		numberOfWares = 0;
		
		for (int i = 0; i < numberOfWares; i++) {
			totalPrice += wares[i].getPrice();
		}
	}
	
	public void add(Ware ware) {
		wares[numberOfWares] = ware;
		numberOfWares++;
		totalPrice += ware.getPrice();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
		
	public void remove(int index) {
		totalPrice -= wares[index].getPrice();
		wares[index] = null;
		
		for (int i = index + 1; i < numberOfWares; i++) {
			wares[i - 1] = wares[i];
		}
		
		numberOfWares--;
		wares[numberOfWares] = null;
	}
	
	public void printAll() {
		for (int i = 0; i < numberOfWares; i++) {
			wares[i].print();
			System.out.println();
		}
	}
	
}
