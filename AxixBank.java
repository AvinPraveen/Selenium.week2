package Week3.day1.overriding;

public class AxixBank extends BankInfo{
	 
	public void deposit() {
		System.out.println("i'm call using object next super keyword will use to call base class deoposit");
		super.deposit();
	}

	public static void main(String[] args) {
		AxixBank ab=new AxixBank();
		ab.saving();
		ab.fixied();
		ab.deposit();
		
		

	}

}
