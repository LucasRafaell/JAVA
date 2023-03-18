package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double dollar, double quantidade) {
		double totInDollars = (dollar * quantidade);
		return totInDollars + (totInDollars * IOF);
		
	}
	
}
