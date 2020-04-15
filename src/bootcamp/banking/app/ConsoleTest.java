package bootcamp.banking.app;

import java.util.ArrayList;

public class ConsoleTest {

	public static void main(String[] args) {
		
		ArrayList<IAccounts> accts = new ArrayList<IAccounts>();
		
		InterestAcct int1 = new InterestAcct();
		InterestAcct int2 = new InterestAcct("Disney IntAcct", 0.6);
		InterestAcct int3 = new InterestAcct("Ctor test Int");
		InterestAcct int4 = new InterestAcct(0.45);
		CheckingAcct check1 = new CheckingAcct();
		CheckingAcct check2 = new CheckingAcct("Test Ctor Check");
		CheckingAcct check3 = new CheckingAcct("Disney Check", 0.6);
		CheckingAcct check4 = new CheckingAcct(0.75);
		SavingsAcct sav1 = new SavingsAcct();
		SavingsAcct sav2 = new SavingsAcct("Disney Sav", 0.9);
		SavingsAcct sav3 = new SavingsAcct("CtorSav");
		SavingsAcct sav4 = new SavingsAcct(0.88);
		
		accts.add(int1);
		accts.add(int2);
		accts.add(int3);
		accts.add(int4);
		accts.add(check1);
		accts.add(check2);
		accts.add(check3);
		accts.add(check4);
		accts.add(sav1);
		accts.add(sav2);
		accts.add(sav3);
		accts.add(sav4);
		
		for (IAccounts acct : accts) {
			System.out.println(acct);
		}
		
	}

}
