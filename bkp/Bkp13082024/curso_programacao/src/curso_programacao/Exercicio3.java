package curso_programacao;

import java.awt.Container;
import javax.swing.*;

public class Exercicio3 {

	public static void main(String[] args) {

		String sc = JOptionPane.showInputDialog("Entre com o valor da variavel texto : ");
		String x = sc;
		System.out.println("O valor da variavel é : " + x);
		
		String sc1 = JOptionPane.showInputDialog("Entre com o valor da variavel numerica : ");
		double y = Double.parseDouble(sc1);
		System.out.println("O valor da variavel é : " + y);
		
	}

}
