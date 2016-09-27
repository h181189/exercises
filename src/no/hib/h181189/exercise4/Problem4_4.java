package no.hib.h181189.exercise4;

import no.hib.h181189.exercises.Problem;

public class Problem4_4 implements Problem {
	
	private final int WIDTH = 100;
	private final int HEIGHT = 6;
	private final char FILL = '0';
	
	@Override
	public void solve() {
		Rectangle r = new Rectangle(WIDTH, HEIGHT, FILL);
		System.out.println("Bredde: " + WIDTH);
		System.out.println("Høyde: " + HEIGHT);
		System.out.println();;
		
		System.out.println("Omkrets: " + r.getPerimeter());
		System.out.println("Areal: " + r.getArea());
		System.out.println();
		r.printRectangle();
	}

}
