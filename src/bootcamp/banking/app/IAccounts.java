package bootcamp.banking.app;

public interface IAccounts {
	// literally just here to make everything into a list shhhhh
	public void deposit(double amt) throws Exception;
	public void withdraw(double amt) throws Exception;
	public void transferTo(double amt, Account toAcct) throws Exception;
}
