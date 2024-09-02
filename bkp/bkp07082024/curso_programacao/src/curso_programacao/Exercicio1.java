package curso_programacao;

import java.text.DecimalFormat;
import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50; 
		double measure = 53.234567;
		
		DecimalFormat df = new DecimalFormat("####.00");
		System.out.println("Products:");
		System.out.println(product1 + ", which price is $ %2f " + df.format(price1));
		System.out.println(product2 + ", which price is $ "  + df.format(price2));
	 	System.out.println("");	
		System.out.println("Record: " + age + " years old, code " +
				code + " and gender: " + gender);
	 	System.out.println("");
	 	
	 	DecimalFormat df2 = new DecimalFormat("####.00000000");
	 	System.out.println("Measure whth eight decimal places: " + df2.format(measure));
	 	DecimalFormat df3 = new DecimalFormat("####.000");
		System.out.println("Rouded (three decimal places): " + df3.format(measure));
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
