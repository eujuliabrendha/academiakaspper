import javax.swing.JOptionPane;

public class Desafio1507CalculaMedia {
	
	public static void main(String[] args) {
		
		/*
		 * O sistema deve pedir ao cliente a entrada do nome do Aluno e suas 3 notas. O
		 * sistema deve calcular a média e informar se o aluno está aprovado ou
		 * reprovado.
		 * 
		 * Aprovado quando a média >=6 caso contrário reprovado.
		 */
		
//		String nome;
//		double nota1;
//		double nota2;
//		double nota3;
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		
//		System.out.printf("%s%s%.2f%n", pj1.getNome(), 
		
		JOptionPane.showMessageDialog(null, "A sua média é: " + media);
		
		if(media>=6) {
			/* System.out.println("Você foi aprovado!"); */
			JOptionPane.showMessageDialog(null, "Você foi aprovado");
		} else {
			/* System.out.println("Você foi reprovado!"); */
			JOptionPane.showMessageDialog(null, "Você foi reprovado");
		}
		
	}
	

	}
		
	
