package Entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
// atributos da classe ^ 
	
	
	public Account(int number, String holder) {
//		super(); indica q tem uma classe pai
//		e essa é filha; logo não precisa.
		this.number = number;
		this.holder = holder;
	
	}

	public Account(int number, String holder, double initalDeposit) {

	this.number = number;
	this.holder = holder;
	deposit(initalDeposit);
	
	
}

//sobrecarga com 3 elementos ^ 

	public int getNumber() {
	return number;
}

	public void setNumber(int number) {
	this.number = number;
}

	public String getHolder() {
	return holder;
}

	public void setHolder(String holder) {
	this.holder = holder;
}

	public double getBalance() {
	return balance;
}

	public void setBalance(double balance) {
	this.balance = balance;
}
		
// 	set altera um dado get consulta um dado	
	
	public void deposit(double amount) {
		balance += amount;
//		balance = balance + amount;
	}
	public void withdraw(double amount) {
	  {
	        balance -= amount + 5.0;
//	        balance = balance - (amount + 5.0);
	    }
		
		
//		if(balance < (amount + 5.0)) {
//		System.out.println("Sem saldo suficiente");
//		} else 
//		balance -= amount + 5.0;
//	    balance = balance - (amount + 5.0);		
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: R$ "
				+ String.format("%.2f", balance);
		
		
				
	}
	
}
