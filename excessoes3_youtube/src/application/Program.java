package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.println("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		if(amount > acc.getWithdrawLimit()) {
			System.out.println("Erro de saque: A quantia excede o limite de saque");
		} else if(amount > acc.getBalance()){
			System.out.println("Erro de saque: Saldo insuficiente");
		}
		
		acc.withdraw(amount);
		System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
	
		sc.close();
	}

}