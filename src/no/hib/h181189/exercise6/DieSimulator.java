package no.hib.h181189.exercise6;

public class DieSimulator {

	final private DiceTable table;

	final private int LINE_WIDTH = 20;

	public DieSimulator(DiceTable table) {
		this.table = table;
	}
	
	public void printTable() {
		String title = "DICE RESULTS";
		String format = "%" + ((LINE_WIDTH * 4 + title.length()) / 2) + "s";
		System.out.printf(format, title);
		System.out.println("\n");
		
		printResults();
		printTimesRolled();
		printStatistics();
	}

	private void printResults() {
		int[] results = table.getResults();
		int width = 0;
		for(int i = 0; i < results.length; i++) {
			System.out.printf("%-4d", results[i]);
			width ++;
			if (width >= LINE_WIDTH) {
				width = 0;
				System.out.println();
			}
		}
		System.out.println();
	}
	
	private void printTimesRolled() {
		System.out.printf("Times rolled: %d", table.getResults().length);
		System.out.println();
		for(int i = Die.MAX_VALUE; i >= Die.MIN_VALUE; i--) {
			System.out.printf("Number of %d: %d", i, table.getFrequency(i));
			System.out.println();
		}
		System.out.println();
	}
	
	private void printStatistics() {
		System.out.printf("Average: %.3f", table.getAverage(), 2);
		System.out.println();

		int i = 0;
		while (table.getResults()[i] != 6) {
			i++;
		}
		System.out.printf("Die was rolled %d times before rolling a six.", i);
		System.out.println();
		
		System.out.printf("The most reoccuring number was %d.", table.getMode());
		System.out.println();
	}

}
