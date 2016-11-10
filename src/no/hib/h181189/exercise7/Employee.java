package no.hib.h181189.exercise7;

public class Employee {
	
	private final double NORMAL_WORK_HOURS = 37.5;
	private final double OVERTIME_WAGE_INCREASE = 50;
	
	private String name;
	private double hours;
	private double wage;
	private int taxPercent;
	
	public Employee(String name, double hours, double wage, int taxPercent) {
		this.name = name;
		this.hours = hours;
		this.wage = wage;
		this.taxPercent = taxPercent;
	}
	
	public Employee() {
		this("", 0, 0, 0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		this.taxPercent = taxPercent;
	}

	public double overtime() {
		return NORMAL_WORK_HOURS < hours ? hours - NORMAL_WORK_HOURS : 0;
	}
	
	public double gross() {
		return (hours - overtime()) * wage + overtime() * wage * OVERTIME_WAGE_INCREASE / 100;
	}
	
	public int tax() {
		return (int) (gross() * taxPercent / 100);
	}
	
	public double income() {
		return gross() - tax();
	}
	
	public void print(int s) {
		String format = "%" + s + "s %" + s + ".2f %" + s + ".2f %" + s + ".2f %" + s + ".2f %" + s + "d %" + s + ".2f\n";
		System.out.printf(format, name, hours, wage, overtime(), gross(), tax(), income());
	}
	
	public void read(String name, double wage, double hours, int taxPercent) {
		this.name = name;
		this.wage = wage;
		this.hours = hours;
		this.taxPercent = taxPercent;
	}
	
}
