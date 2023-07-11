package application;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        System.out.println("Common, used or imported? (c/u/i)? ");
        int ch = sc.charAt(0);

        System.out.println();
    }
}