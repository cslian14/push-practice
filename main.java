import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		double weightInOnce, insuranceVal;
		char shippingMethod;	
		
		System.out.print("Without Insurance\n\n");
		Package p = new Package(10, 'A');
		p.display();
		
		System.out.print("\n");
		
		System.out.print("With Insurance\n\n");
		InsuredPackage insurance = new InsuredPackage(10, 'A');
		insurance.display();
		
		
		
	}

}
