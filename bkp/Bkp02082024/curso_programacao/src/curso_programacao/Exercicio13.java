package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		String sc = JOptionPane.showInputDialog("Leia um número : ");
		
		int N = Integer.parseInt(sc);
		
		int mod = 0;
		for (int i=0;  i<N+1; i ++) {
			
			mod = Math.floorMod(i,2);
			if(mod != 0 )  {  
				System.out.println("Resultado : " + i);   
				}

			
			
		}
		
	}

}