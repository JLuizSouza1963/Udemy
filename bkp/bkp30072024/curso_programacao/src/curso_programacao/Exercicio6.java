package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Entre com o primeiro nro : ");
		String n2 = JOptionPane.showInputDialog("Entre com o segundo nro : ");
		
		int a,b,c;
		
		a = Integer.parseInt(n1);
		b = Integer.parseInt(n2);
		c = a + b;
		
		System.out.println("A soma dos números é : " + c);

		
	}

}
