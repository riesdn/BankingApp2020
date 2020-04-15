package bootcamp.banking.app;

class InterestAcct extends Account {
	
	// TODO PROPERTIES
	private double _interestRate;
	private int _payPeriod;
	
	// TODO METHODS
	public String toString() {
		return String.format("AcctNum: %d | %s | Balance: $%-9.2f | %-9.2f", this.getAcctNum(), this.getDesc(), this.getBalance(), this.getInterestRate());
	}
	
	public void calcInterest() {
		// formula:
		// amount = balance * (interest rate / intervals per year) * units paid out this time;
		double interest = this.getBalance() * (this._interestRate / 12) * this._payPeriod;
		
		try {
			this.deposit(interest);
			System.out.println(String.format("Interest this period: $%-9.2f", interest));
		} catch (Exception e) {
			System.out.println("No interest gained this period.");
		}
	}
	
	// TODO CONSTRUCTORS
	public InterestAcct(String desc, double interestRate) {
		super(desc);
		this.setInterestRate(interestRate);
		this.setPayPeriod(3);
	}
	
	public InterestAcct(double interestRate) {
		this("Interest Account", interestRate);
	}
	
	public InterestAcct(String desc) {
		this(desc, 0.06);
	}
	
	public InterestAcct() {
		this(0.06);
	}
	
	// TODO GETTERS AND SETTERS
	public double getInterestRate() {
		return _interestRate;
	}
	public void setInterestRate(double interestRate) {
		this._interestRate = interestRate;
	}
	public int getPayPeriod() {
		return _payPeriod;
	}
	public void setPayPeriod(int payPeriod) {
		this._payPeriod = payPeriod;
	}
	
}
