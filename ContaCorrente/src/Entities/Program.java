package Entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account; 
		
		
		System.out.print("Enter account number: ");
// 		só print é pra o prox codigo ir seguido ao anterior; 		
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
//		char = tipo primitivo; se diferencia da string pq tem apenas 1 caracter	
//		charAt é onde a posição do cursor está, é onde vai ser digitado o 
//		treco		
//		String response = sc.next();
		if(response == 'y') {
// 		apenas um caracter só usa ' ' ^	
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else { account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
//		 if (account.getBalance() < 0) {
//	        	System.out.println("Sem saldo suficiente. ");
//	        }
			
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        
       
		sc.close();
	}

}
