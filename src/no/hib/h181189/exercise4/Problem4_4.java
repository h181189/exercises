package no.hib.h181189.exercise4;

import no.hib.h181189.exercises.Problem;

public class Problem4_4 implements Problem {
	
	private int width;
	private int height;
	private char fill;
	
	public Problem4_4(int width, int height, char fill) {
		this.width = width;
		this.height = height;
		this.fill = fill;
	}
	
	public int getPerimeter() {
		return 2 * (height + width);
	}
	
	public int getArea() {
		return height * width;
	}
	
	public void printRectangle() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(fill + " ");
			}
			System.out.println();
		}
	}
	
	@Override
	public void solve() {
		System.out.println("Omkrets: " + getPerimeter());
		System.out.println("Areal: " + getArea());
		System.out.println();
		printRectangle();
	}

}
