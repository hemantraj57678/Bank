
public class Customer {
	
	int id;
	String name;
	int balance;
	int amount=0;
	
	Customer(int i,String n, int b){
		id=i;
		name=n;
		balance=b;
		System.out.println("Hi "+name+", Your account balance is "+balance);
	}
	
	void Deposit(int amount) {
		balance = amount+balance;
		System.out.println("Your balance is now :"+balance);
	}
	
	void Withdrawl(int amount) {
		
		if(amount<balance) {
			balance = balance-amount;
		System.out.println("Your balance is now :"+balance);
	}
		else {
			System.out.println("You have insuffiecient Balance.");
		}
		}
	
}
