package bootcamp.banking.app;

public class SavingsAcct extends InterestAcct {

	
	// METHODS
	public String toString() {
		return String.format("AcctNum: %d | %s | Balance: $%-9.2f | %-9.2f", this.getAcctNum(), this.getDesc(), this.getBalance(), this.getInterestRate());
	}
	
	
	// TODO CONSTRUCTORS
	public SavingsAcct(String desc, double intRate) {
		super(desc, intRate);
	}
	
	public SavingsAcct(String desc) {
		this(desc, 0.06);
	}
	
	public SavingsAcct(double intRate) {
		this("Savings Account", intRate);
	}
	
	public SavingsAcct() {
		this(0.06);
	}
}
