package testassignment;

public class SavingsAccount implements BankAccount {
	@Override
	public void CheckBalance() {
		System.out.println("check balance from savings account");
		
	}

	@Override
	public void ValidateUser() {
		System.out.println("Validate user from savings account");
	}

}
