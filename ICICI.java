package abstraction;

public class ICICI extends Bank {
	@Override
	public void withdraw() {
		System.out.println("Withdraw method of ICICI Bank");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit method of ICICI Bank");
		
	}
	
	public static void main(String[] args) {
		
		ICICI icici=new ICICI();
		icici.deposit();
		icici.withdraw();
		icici.reporate();
		
		Bank bank=new ICICI();
		bank.deposit();
		bank.withdraw();
		bank.reporate();
	}

}
