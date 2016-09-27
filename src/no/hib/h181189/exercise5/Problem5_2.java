package no.hib.h181189.exercise5;

import no.hib.h181189.exercises.Problem;

public class Problem5_2 implements Problem {

	@Override
	public void solve() {
		
		RectangleCollection rc = new RectangleCollection(10);
		rc.add(new Rectangle(10, 10, '*'));
		rc.add(new Rectangle(10, 15, 'a'));
		rc.add(new Rectangle(3, 7, '-'));
		rc.add(new Rectangle(8, 8, '+'));
		rc.add(new Rectangle(1, 2, '±'));
		
		rc.drawAll();
		System.out.println("Total area: " + rc.getTotalArea());
	}
	
}
