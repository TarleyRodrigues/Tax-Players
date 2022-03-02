package entities;

public class Company extends TaxPlayers {

	private int numOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numOfEmployees) {
		super(name, anualIncome);
		this.numOfEmployees = numOfEmployees;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public double taxesPaid() {
		if(numOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}

}
