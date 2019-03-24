import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class Calculate {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		CalculatorSoap calSoap = cal.getCalculatorSoap();
		System.out.println("Addition: "+calSoap.add(5, 10));
		System.out.println("Subtraction:"+calSoap.subtract(10, 5));
		System.out.println("Multiplication: "+calSoap.multiply(5, 10));
		System.out.println("Division: "+calSoap.divide(10, 5));
		
	}

}
