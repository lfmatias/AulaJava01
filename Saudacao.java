import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao {

	public static void	main (String args[]){

		System.out.print("Digite o nome @do ");

		Scanner entrada = new Scanner(System.in);
		
		//String nome = entrada.nextLine();
		String nome = JOptionPane.showInputDialog("Digite o nome do @do");

		System.out.println("O nome do @do é " + nome);

		System.out.println(" Bem vindo! - @do");

	}

}