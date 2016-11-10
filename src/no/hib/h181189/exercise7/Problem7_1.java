package no.hib.h181189.exercise7;

import no.hib.h181189.exercise6.Ware;
import no.hib.h181189.exercises.Problem;

public class Problem7_1 implements Problem {
	
	private final int CAPACITY = 10;
	private final String[] WARE_NAMES = {"Melk", "Brød", "Katt", "Ris", "Krydder", "Pizza", "Snop", "Brus", "Dopapir", "Zalo"};
	
	@Override
	public void solve() {
		
		WareTable wares = new WareTable(CAPACITY);
		for (int i = 0; i < CAPACITY / 2; i++) {
			wares.add(new Ware(WARE_NAMES[i], Math.random() * 50, i + 1));
		}
		
		wares.printAll();
		System.out.printf("Samlet pris: %.2f", wares.getTotalPrice());
		System.out.println();
		System.out.println();
		
		wares.remove(4);
		wares.printAll();
		System.out.printf("Samlet pris: %.2f", wares.getTotalPrice());
		
		
	}
	
}
