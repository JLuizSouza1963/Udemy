package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Leia o valor de A : ");
		String b = JOptionPane.showInputDialog("Leia o valor de B : ");
		String c = JOptionPane.showInputDialog("Leia o valor de C : ");
		String d = JOptionPane.showInputDialog("Leia o valor de D : ");
		
		int diferença, A,B,C,D;
		
		diferença = (Integer.parseInt(a) * Integer.parseInt(b) - (Integer.parseInt(c)*Integer.parseInt(d)));
		
		System.out.println("A diferença entre o produto de A por B e C por D é " + diferença);
		
	}

}
