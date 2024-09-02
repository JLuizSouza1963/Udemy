package curso_programacao;

import java.awt.Container;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro nro : ");
		int total = 0;
		
		while (Integer.parseInt(n1) != 0) {
			total = total + Integer.parseInt(n1);
			String n2 = JOptionPane.showInputDialog("Entre com o primeiro nro : ");
			n1 = n2;
		}
		System.out.println("O soma dos valores digitados foi : " + total);		
	}
	
}
