package entities;

public abstract class TaxPlayers {

	private String name;
	private Double AnualIncome;
	
	public TaxPlayers() {
	}

	public TaxPlayers(String name, Double anualIncome) {
		this.name = name;
		AnualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return AnualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract double taxesPaid();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(": $ ");
		builder.append(String.format("%.2f", taxesPaid()));
	
		return builder.toString();
	}

	
}
