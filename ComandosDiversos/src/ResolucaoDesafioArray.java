import javax.swing.JOptionPane;

public class ResolucaoDesafioArray {

	/*
	 * Desafio 1: registrar 4 alunos e 3 notas. Calcular a média final e situação
	 * final (aprovado ou reprovado).
	 */

	public static void main(String[] args) {

		String[] aluno = new String[4];
        double[] notas = new double[3];
        double[] medias = new double[4];
        int i = 0;
        int j = 0;
        int q = 0;
        while (i < aluno.length) {
            aluno[i] = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ");
            i++;

 

            while (j < notas.length) {
                notas[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota: "));
                j++;
            }
            medias[q] = (notas[0] + notas[1] + notas[2]) / 3;
            q = q + 1;
            j = 0;

 

        }
        System.out.println("Nome: "+aluno[0]+ " Média: "+medias[0]);
        System.out.println("Nome: "+aluno[1]+ " Média: "+medias[1]);
        System.out.println("Nome: "+aluno[2]+ " Média: "+medias[2]);
        System.out.println("Nome: "+aluno[3]+ " Média: "+medias[3]);
    }
}

//		String[] aluno = new String[4];
//		double[] notas = new double[3];
//		double[] medias = new double[4];
//
//		int i = 0;
//		int j = 0;
//		int q = 0;
//		while (i < aluno.length) {
//
//			aluno[i] = JOptionPane.showInputDialog(null, "Digite o nome do aluno(a): ");
//			i++;
//
//			while (j < notas.length) {
//				notas[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite as notas do aluno(a): "));
//			}
//			
//			medias[q] = (notas[0] + notas[1] + notas[2]) / 3;
//			q = q + 1;
//			j = 0;
//		}
//
//		System.out.println("Nome: " + aluno[0] + "Média: " + medias[0]);
//		System.out.println("Nome: " + aluno[1] + "Média: " + medias[1]);
//		System.out.println("Nome: " + aluno[2] + "Média: " + medias[2]);
//		System.out.println("Nome: " + aluno[3] + "Média: " + medias[3]);
//	}	
//}
