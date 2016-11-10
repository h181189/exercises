package no.hib.h181189.exercise7;

import java.util.Scanner;

public class Payroll {

	private final String name;
	private Employee[] employees;
	private int numberOfEmployees = 0;

	private double totalOvertime = 0;
	private double totalGross = 0;

	public Payroll(String name, int initialCapacity) {
		this.name = name;
		this.employees = new Employee[initialCapacity];
	}

	public void add(Employee... e) {
		for (int i = numberOfEmployees, j = 0; i < employees.length && j < e.length; i++, j++) {
			if (e[j] != null) {
				employees[i] = e[j];
				numberOfEmployees++;
			}
		}
	}

	public double totalOvertime() {
		return totalOvertime;
	}

	public double totalGross() {
		return totalGross;
	}

	public void printOverview(int s) {
		String[] tabs = { "Name", "Hours", "Wage", "Overtime", "Gross", "Tax", "Income" };
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

		for (int i = 0; i < numberOfEmployees; i++) {
			employees[i].print(s);
		}
	}

	public void printHighestGross() {
		Employee e = employees[0];
		for (int i = 0; i < numberOfEmployees; i++) {
			if (e.gross() < employees[i].gross()) {
				e = employees[i];
			}
		}
		System.out.printf("Name: %s, wage: %f", e.getName(), e.gross());
	}
	
	public void searchAndPrint() {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		Employee e = null;
		for (int i = 0; i < employees.length && e == null; i++) {
			if (name == employees[i].getName()) {
				e = employees[i];
			}
		}
		
		if (e != null) {
			e.print(5);
		}
	}
}
