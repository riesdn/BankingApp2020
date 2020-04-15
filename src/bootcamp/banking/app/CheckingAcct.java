package bootcamp.banking.app;

public class CheckingAcct implements IAccounts {

	// TODO PROPERTIES
	private InterestAcct _interestAcct;
	private static int _checkNum; // number of checks withdrawn from account
	
	// TODO METHODS
	public String toString() {
		return String.format("AcctNum: %d | %s | Balance: $%-9.2f | %-9.2f", this.getInterestAcct().getAcctNum(), this.getInterestAcct().getDesc(), this.getInterestAcct().getBalance(), this.getInterestAcct().getInterestRate());
	}
	
	public void deposit(double amt) throws Exception {
		this.getInterestAcct().deposit(amt);
	}
	
	public void withdraw(double amt) throws Exception {
		this.getInterestAcct().withdraw(amt);
		setCheckNum(getCheckNum() + 1);
	}
	
	public void calcInterest() {
		this.getInterestAcct().calcInterest();
	} 
	
	public void transferTo(double amt, Account toAcct) throws Exception {
		this.getInterestAcct().transferTo(amt, toAcct);
	}
	
	public void transferTo(double amt, CheckingAcct toAcct) throws Exception {
		this.getInterestAcct().transferTo(amt, toAcct.getInterestAcct());
	}
	
	
	
	// TODO CONSTRUCTORS
	public CheckingAcct(String desc, double intRate) {
		setInterestAcct(new InterestAcct(desc, intRate));
	}
	
	public CheckingAcct(String desc) {
		this(desc, 0.06);
	}
	
	public CheckingAcct(double intRate) {
		this("Checking Account", intRate);
	}
	
	public CheckingAcct() { 
		this(0.06);
	}

	
	// TODO GETTERS AND SETTERS
	public InterestAcct getInterestAcct() {
		return _interestAcct;
	}

	public void setInterestAcct(InterestAcct interestAcct) {
		this._interestAcct = interestAcct;
	}

	public static int getCheckNum() {
		return _checkNum;
	}

	private static void setCheckNum(int checkNum) {
		CheckingAcct._checkNum = checkNum;
	}
	
}
