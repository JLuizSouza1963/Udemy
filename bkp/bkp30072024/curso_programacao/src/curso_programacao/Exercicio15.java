package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		String sc = JOptionPane.showInputDialog("Leia o número de repetições : ");

		int n = Integer.parseInt(sc);

		for (int i = 0; i < n; i++) {

			String recebe = JOptionPane.showInputDialog(null, "Entre com um valor");

			int converteRecebeInt = Integer.parseInt(recebe); // converte String para int
			float converteRecebeFloat = Float.parseFloat(recebe); // converte String para float
			double converteRecebeDouble = Double.parseDouble(recebe); // converte de String para Double
			String a = JOptionPane.showInputDialog("Leia o primeiro nro : ");
			String b = JOptionPane.showInputDialog("Leia o segundo nro : ");
			String c = JOptionPane.showInputDialog("Leia o terceiro nro : ");

			/*String media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;*/

			/*System.out.printf("%.1f%n", media);*/
		}

	}
}