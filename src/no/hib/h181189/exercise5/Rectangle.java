package no.hib.h181189.exercise5;

public class Rectangle {
	
	private char fill;
	private int width;
	private int height;
	
	public Rectangle(int width, int height, char fill) {
		this.width = width;
		this.height = height;
		this.fill = fill;
	}
	
	public int getPerimeter() {
		return 2 * (width + height);
	}
	
	public int getArea() {
		return width * height;
	}
	
	public void printRectangle() {
		String s = "";
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				s += fill;
			}
			s += "\n";
		}
		System.out.println(s);
	}
	
	public char getFill() {
		return fill;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setFill(char fill) {
		this.fill = fill;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
}
