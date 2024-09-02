package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		String raio = JOptionPane.showInputDialog("Leia o valor do raio do circulo : ");
		
		double pi = 3.14159;
		double area;
		
		area = pi * Math.pow(Integer.parseInt(raio), 2);
		
		System.out.println("A área do circulo é : " + area);
		

	}

}
