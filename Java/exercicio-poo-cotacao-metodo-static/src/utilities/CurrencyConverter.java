package utilities;

public class CurrencyConverter {
	
	public static double converter(double dollarPrice, double qtdDollar) {
		return dollarPrice * qtdDollar;
	}
	
	public static double iof(double totalConvertido) {
		return totalConvertido * 1.06; 
	}
	
}
