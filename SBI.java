package abstraction;

public class SBI extends Bank {
	@Override
	public void withdraw() {
	System.out.println("Withdraw Method of SBI Bank");
		
	}

	@Override
	public void deposit() {
	System.out.println("Deposit Method of SBI Bank");
		
	}
	
	public static void main(String[] args) {
		
		SBI sbi =new SBI();
		sbi.withdraw();
		sbi.deposit();
		sbi.reporate();
		
		Bank bank=new SBI();
		bank.withdraw();
		bank.deposit();
		bank.reporate();

}
}
