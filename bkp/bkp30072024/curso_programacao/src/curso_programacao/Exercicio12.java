package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		
		String sc = JOptionPane.showInputDialog("Leia o nro de repetições  : ");
		
		int N = Integer.parseInt(sc);
		
		int soma = 0;
		for (int i=0;  i<N; i ++) {
			
			String x = JOptionPane.showInputDialog("Leia o nro  : ");
			soma = soma + Integer.parseInt(x);
			
		}
		
		System.out.println("O valor da soma é : " + soma);

	}

}
