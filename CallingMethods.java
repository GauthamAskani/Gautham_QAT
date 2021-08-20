package testassignment;

public class CallingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount cs= new CurrentAccount();
		SavingsAccount sc= new SavingsAccount();
		cs.CheckBalance();
		cs.ValidateUser();
		sc.CheckBalance();
		sc.ValidateUser();

	}

}
