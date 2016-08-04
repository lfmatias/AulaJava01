import javax.swing.JOptionPane;

class Triangulo {

	public static void main (String args []){
		
		int base, altura,resultado;

		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));

		resultado = (base * altura)/2;

		System.out.println("O varlo do Triângulo é " + resultado);

	}
}