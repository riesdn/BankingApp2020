package bootcamp.banking.app;

public abstract class Account implements IAccounts {
	
	// TODO PROPERTIES
	private static int _nextAcctNum = 1;
	private int _acctNum;
	private String _desc;
	private double _balance;
	
	// TODO METHODS
//	public boolean isNotZero(double amt) throws Exception {
//		if (amt <= 0) {
//			throw new Exception("Amount cannot be $0.00 or less.");
//		}
//		return true;
//	}
	
	public void deposit(double amt) throws Exception {
		if (amt <= 0) { throw new Exception("Cannot deposit 0 dollars."); }
		this.setBalance(this.getBalance() + amt);
		System.out.println(String.format("Deposit: $%-9.2f", amt));
		System.out.println(String.format("New Balance: $%-9.2f", this.getBalance()));
	}
	
	public void withdraw(double amt) throws Exception {
		if (amt <= 0) { throw new Exception("Cannot withdraw 0 dollars."); }
		if (amt > this.getBalance()) { throw new Exception("Insufficient funds."); }
		this.setBalance(this.getBalance() - amt);
		System.out.println(String.format("Withdrawal: $%-9.2f", amt));
		System.out.println(String.format("New Balance: $%-9.2f", this.getBalance()));
	}
	
	public void transferTo(double amt, Account toAcct) throws Exception {
		if (amt <= 0) { throw new Exception("Cannot transfer 0 dollars."); }
		if (amt > this.getBalance()) { throw new Exception("Insufficient funds."); }
		this.withdraw(amt);
		toAcct.deposit(amt);
	}
	
	// TODO CONSTRUCTORS
	public Account(String desc) {
		setAcctNum(_nextAcctNum++);
		setDesc(desc);
		setBalance(0);
	}
	
	public Account() {
		this("Generic Account");
	}

	// TODO GETTERS AND SETTERS
	public int getAcctNum() {
		return _acctNum;
	}

	protected void setAcctNum(int acctNum) {
		this._acctNum = acctNum;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		this._desc = desc;
	}

	public double getBalance() {
		return _balance;
	}

	public void setBalance(double balance) {
		this._balance = balance;
	}

}
