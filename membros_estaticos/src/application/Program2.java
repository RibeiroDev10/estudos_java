package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double dollarAmout = sc.nextDouble();
		
		System.out.printf("Amout to be paid in reais = %.2f", CurrencyConverter.converter(dollarAmout, dollarPrice));
		
		sc.close();
		
	}

}
