import javax.swing.JOptionPane;

class Triangulo {

	public static void main (String args []){
		
		int base, altura;
		double resultado;

		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));

		// 2d para indicar que o valor pode ser decimal
		resultado = (base * altura)/2d;

		// %.2f\n para indicar que o valor da variavel pode ter duas casas decimais
		System.out.println("O varlo do Triângulo é %.2f\n " + resultado);

	}
}