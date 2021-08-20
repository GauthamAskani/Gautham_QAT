package testassignment;

public class CurrentAccount implements BankAccount {
	@Override
	public void CheckBalance() {
		System.out.println("check balance from current account");
		
	}

	@Override
	public void ValidateUser() {
		System.out.println("Validate user from current account");
	}


}
