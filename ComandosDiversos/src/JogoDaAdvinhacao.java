import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 1;
		int numSorteado = new Random().nextInt(10) + 1;
		int palpite = sc.nextInt();
		
		System.out.println("Digite o número: ");
		
//		int palpite = 5;
//		int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Seu palpite? "));
		
		if (numSorteado == palpite) {
			System.out.println("Acertoooooou!");
		} else { 
			System.out.println("Errrrrrrrrrrou");
			System.out.println("O número sorteado foi: " + numSorteado);;
		}
	   
//    while (numSorteado != palpite) {
//        System.out.println("Continuar Jogando?");
//        palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Seu Palpite? "));
//    }
//    System.out.println("Acabou o jogo");
		
//		System.out.println(numSorteado);
		
		  while (opcao == 1) {
//            System.out.println("Quer chutar um numero? ");
//            System.out.println("1 - sim / 2 - não");
//            opcao = sc.nextInt();
			  
            if (palpite == numSorteado) {
                System.out.println("vc acertou");
                opcao = 2;
            } else {
                System.out.println("vc errou");
//                System.out.println("O numero era " + numeroSorteado);
                System.out.println("Quer chutar um numero? ");
                System.out.println("1 - sim / 2 - não");
                opcao = sc.nextInt();
            }
        }

        sc.close();

    }

}
