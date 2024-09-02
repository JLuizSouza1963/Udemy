package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		String sc = JOptionPane.showInputDialog("Leia o número de repetições : ");

		int N = Integer.parseInt(sc);

		int sumIn = 0;
		int sumOut = 0;
		for (int i = 0; i < N + 1; i++) {

			String lido = JOptionPane.showInputDialog("Leia o número  : ");
			if (Integer.parseInt(lido) >= 10) {
				if (Integer.parseInt(lido) <= 20) {
					sumIn = sumIn + 1;
				} else {
					sumOut = sumOut + 1;
				}
			}
		}
		
		System.out.println("Foram lidos " + sumIn + " dentro do intervalo 10-20");	
		System.out.println("Foram lidos " + sumOut + " fora do intervalo 10-20");
	}

}