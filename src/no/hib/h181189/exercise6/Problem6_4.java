package no.hib.h181189.exercise6;

import no.hib.h181189.exercises.Problem;

public class Problem6_4 implements Problem {

	@Override
	public void solve() {
		Ware w = new Ware("Tomato", 20, 2);
		Ware w2 = new Ware("Cucumber", 15, 3);
		
		w.print();
		System.out.println();
		w2.print();
		
		Ware a;
		Ware b;
		a = w2;
		b = w;
		if(w.cheaperThan(w2)) {
			a = w;
			b = w2;
		}
		System.out.printf("%s is cheaper than %s, by %.1f kr.", a.getName(), b.getName(), b.getPrice() - a.getPrice());
	}
	
}
