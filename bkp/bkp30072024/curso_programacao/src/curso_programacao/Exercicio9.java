package curso_programacao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio9 {

	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Entre com o numero do funcionario  : ");
		String horas = JOptionPane.showInputDialog("Entre com o numero de horas : ");
		String valor = JOptionPane.showInputDialog("Entre com o valor da hora : ");

		DecimalFormat df = new DecimalFormat("####.00");
		System.out.println("O numero do funcionario é : " + numero);
		System.out.println("O valor do salario é : " + df.format(Integer.parseInt(horas) * Integer.parseInt(valor)));
		
	}

}
