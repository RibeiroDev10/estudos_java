package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dollarAmount, double dollarPrice) {
		
		dollarAmount += (dollarAmount * IOF);
		
		double result = dollarAmount * dollarPrice;
		
		return result;
		
	}
	
}
