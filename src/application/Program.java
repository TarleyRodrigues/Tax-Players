package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPlayers> list = new ArrayList<>();

		System.out.print("Enter the number of tax players: ");
		int numTP = sc.nextInt();

		for (int i = 1; i <= numTP; i++) {
			System.out.println("Tax player #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numEmp = sc.nextInt();
				list.add(new Company(name, anualIncome, numEmp));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPlayers tp : list) {
			System.out.println(tp);
		}
		
		
		System.out.println();
		
		double total = 0.0;
		for(TaxPlayers tp : list) {
			total += tp.taxesPaid();
		}
		
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", total));
		

		sc.close();

	}

}
