package curso_programacao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		String codigo = JOptionPane.showInputDialog("Entre com o codigo da peça 1  : ");
		String qtde = JOptionPane.showInputDialog("Entre com o numero de peças de codigo 1 : ");
		String valUnit = JOptionPane.showInputDialog("Entre com o valor unitario da peça 1 : ");

		String codigo2 = JOptionPane.showInputDialog("Entre com o codigo da peça 2  : ");
		String qtde2 = JOptionPane.showInputDialog("Entre com o numero de peças de codigo 2 : ");
		String valUnit2 = JOptionPane.showInputDialog("Entre com o valor unitario da peça 2 : ");
		
		int total1, total2, total;
		
		DecimalFormat df = new DecimalFormat("####.00");
		total1 = Integer.parseInt(qtde) * Integer.parseInt(valUnit);
		total2 = Integer.parseInt(qtde2) * Integer.parseInt(valUnit2);
		
		total = total1 + total2;

		System.out.println("O valor total é : " + df.format(total));
		
		
	}

}
