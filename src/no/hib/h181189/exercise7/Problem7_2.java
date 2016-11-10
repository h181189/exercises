package no.hib.h181189.exercise7;

import no.hib.h181189.exercises.Problem;

public class Problem7_2 implements Problem {
	
	private final String[] names = {"Man", "Guy", "Dude", "Bud", "Stud", "Turd"}; 
	private Employee[] employees;
	
	@Override
	public void solve() {
		
		employees = new Employee[6];
		
		for (int i = 0; i < employees.length; i++) {
			Employee e = new Employee();
			e.read(names[i], Math.random() * 100 + 50, Math.random() * 56 + 8, (int) (Math.random() * 20 + 5));
			employees[i] = e;
		}
		
		printAll(10);
		
	}
	
	private void printAll(int s) {
		String[] tabs = {"Name", "Hours", "Wage", "Overtime", "Gross", "Tax", "Income"};
		String format = "";
		String linebreak = "";
		char linebreakSymbol = '˙';
		for (int i = 0; i < tabs.length; i++) {
			format += "%" + s + "s ";
			for (int j = 0; j < s; j++) {
				linebreak += linebreakSymbol;
			}
		}
		for (int i = 0; i < tabs[tabs.length - 1].length(); i++) {
			linebreak += linebreakSymbol;
		}
		format += "\n";
		System.out.printf(format, tabs[0], tabs[1], tabs[2], tabs[3], tabs[4], tabs[5], tabs[6]);
		System.out.println(linebreak);
		
		for (Employee e : employees) {
			e.print(10);
		}
	}
	
}
