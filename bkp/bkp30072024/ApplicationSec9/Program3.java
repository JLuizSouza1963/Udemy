package ApplicationSec9;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec9.Product3;

public class Program3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product3 p = new Product3();
		
		/*Product product = new Product();*/
		System.out.println("Enter product data : ");
		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Price : ");
		double price = sc.nextDouble();

		Product3 product = new Product3(name, price);
		
		product.setName("Computador");
		System.out.println("Alterado nome : " + product.getName());
		product.setPrice(1200.0);
		System.out.println("Preço alterado : " + product.getPrice());
		
		
		System.out.println("Product data : " + product);
		
		System.out.println();
		System.out.print("Enter the number of products do be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data : " + product);
		
		System.out.println();
		System.out.print("Enter the number of products do be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProcucts(quantity);

		System.out.println();
		System.out.print("Updated data : " + product);
		
		sc.close();
	}
}

