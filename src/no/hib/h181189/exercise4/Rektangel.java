package no.hib.h181189.exercise4;

public class Rektangel {
	
	private char fill;
	private int height;
	private int width;
	
	public Rektangel(int width, int height, char fill) {
		this.fill = fill;
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return height * width;
	}
	
	public int getPerimeter() {
		return 2 * (height + width);
	}

	public void printRectangle() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(fill + " ");
			}
			System.out.println();
		}
	}
	
}
