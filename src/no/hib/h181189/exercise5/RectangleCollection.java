package no.hib.h181189.exercise5;

public class RectangleCollection {
	
	private Rectangle[] rc;
	private int size = 0;
	
	public RectangleCollection(int capacity) {
		rc = new Rectangle[capacity];
	}
	
	public void add(Rectangle rect) {
		rc[size] = rect;
		size++;
	}
	
	public void drawAll() {
		for(Rectangle rect : rc) {
			if(rect != null) {
				rect.printRectangle();
			}
		}
	}
	
	public int getTotalArea() {
		int area = 0;
		for(Rectangle rect : rc) {
			if(rect != null) {
				area += rect.getArea();
			}
		}
		return area;
	}
	
	
}
