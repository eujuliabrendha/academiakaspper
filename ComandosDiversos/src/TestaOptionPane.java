import javax.swing.JOptionPane;

public class TestaOptionPane {
	
	public static void main(String[] args) {
		
		/* int premio = 10; */
		double salario = 1500.99;
		float pl = 1000.00f;
		
		double valortotal = salario + pl;
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		// casting de valores integer.parseInt
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		JOptionPane.showMessageDialog(null, "Olá " +  nome + "\nSua idade é: " + idade + " anos." + "\nSalário + pl é: " + valortotal);
		
		
	}

}
