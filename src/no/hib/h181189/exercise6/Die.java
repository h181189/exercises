package no.hib.h181189.exercise6;

public class Die {
	
	private int value;
	public static final int MAX_VALUE = 6;
	public static final int MIN_VALUE = 1;
	
	public int getValue() {
		return value;
	}
	
	public void roll() {
		this.value = (int) Math.round(Math.random() * (MAX_VALUE - MIN_VALUE)) + MIN_VALUE;
	}
	
}
