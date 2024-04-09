package File;

import java.util.Scanner;

public class test3 {
	 public static void main(String[] args) throws InvalidCharacerException, LowBalanceException {
			Scanner scan=new Scanner(System.in);
			int balance=scan.nextInt();
			int withdraw=scan.nextInt();
			try {
				balance=balance-withdraw;
				if(balance>0) {
					System.out.println(balance);
				}
				else {
					throw new LowBalanceException("insufficient balance");
				}
			}
			catch(LowBalanceException e) {
				System.err.println("LowBalanceException occured");
			}
		}
}
