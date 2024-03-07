package p2;
import java.util.Scanner;

public class BankAccount {
static	Scanner scn = new Scanner(System.in) ;
static int bankBalance=10000 ;
  public static void bankDetial (){
	System.out.println("Enter bank name ");
	String bank = scn.next();
	System.out.println("Enter Account Holder name ");
	String accHolderName = scn.next();
	System.out.println("Enter Account  no.");
	long bankAcc = scn.nextLong();
	System.out.println("Enter IFSC no. ");
	String ifsc =scn.next();
	System.out.println("Enter Bank Branch name ");
	String bankBranch =scn.next();
	
	System.out.println("Welcome Home");
	System.out.println("1.Deposite \n2.Withdrow \n3.Cancel");
	int choice=scn.nextInt();
	switch (choice) {
	case 1 : try {
		bankBalance	=deposite();
	} catch (IllegalArgumentException e1) {
    System.err.println(e1.getMessage()); 
	}
	break;
	case 2 : try {
		bankBalance	=withdraw();
	} catch (IllegalArgumentException e1) {
    System.err.println(e1.getMessage()); 
	}
	break;
	case 3 : break;
	default: System.out.println("Invalid Choice");
	}
	
	System.out.println("Bank Name              :  "+bank);
	System.out.println("Account holder Name    :  "+accHolderName);
	System.out.println("Bank Account number    :  "+bankAcc);
	System.out.println("Bank IFSC              :  "+ifsc);
	System.out.println("Bank Branch            :  "+bankBranch);
	System.out.println("Bank Balence           :  "+bankBalance);
   }
  static int deposite()  {
        System.out.println("Enter how much to Deposite ");
        int  Deposite =scn.nextInt();
        if(Deposite<=0  ) {
        	throw new  IllegalArgumentException("Do not pass 0 or -ve ");
        }
        bankBalance +=Deposite;
        return bankBalance;
  }
  static int withdraw()  {
      System.out.println("Enter how much to Withdraw");
      int  Withdraw =scn.nextInt();
      if(Withdraw<=0  ) {
      	throw new  IllegalArgumentException("Do not pass 0 or -ve ");
      }
      bankBalance -=Withdraw;
      return bankBalance;
}
}
