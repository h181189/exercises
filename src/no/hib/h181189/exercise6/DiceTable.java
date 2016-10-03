package no.hib.h181189.exercise6;

public class DiceTable {

	private final int[] results;

	private final int[] frequencies;
	private double average = 0;
	private int mode;

	final Die die = new Die();

	public DiceTable(int size) {
		results = new int[size];
		frequencies = new int[Die.MAX_VALUE + 1];

		rollDice(size);
	}

	public int[] getResults() {
		return results;
	}

	public int getFrequency(int value) {
		return frequencies[value];
	}

	public double getAverage() {
		return average;
	}
	
	public int getMode() {
		return mode;
	}

	public void rollDice(int size) {
		average = 0;
		mode = 0;
		for(int i = 0; i < results.length; i++) {
			results[i] = 0;
		}
		for(int i = Die.MIN_VALUE; i < Die.MAX_VALUE; i++) {
			frequencies[i] = 0;
		}
		
		for (int i = 0; i < size; i++) {
			die.roll();
			results[i] = die.getValue();
			frequencies[die.getValue()] += 1;
		}
		
		int mostFrequencies = 0;
		for (int i = Die.MIN_VALUE; i < Die.MAX_VALUE + 1; i++) {
			if(frequencies[i] > mostFrequencies) {
				mostFrequencies = frequencies[i];
				mode = i;
			}
			average += (i * frequencies[i]);
		}
		average /= results.length;
	}

}
