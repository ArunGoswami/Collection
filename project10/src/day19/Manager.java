package day19;

import java.util.Scanner;

public class Manager {
     int Managerid;
     String Managersalary;
     
     public void setdata() {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter id");
    	 Managerid=scan.nextInt();
    	 System.out.println("Enter salary");
    	 Managersalary=scan.next();
     }
     public void getdata() {
    	 System.out.println("Enter id"+Managerid);
    	 System.out.println("Meeting Schedule"+Managersalary);
     }
     public static void main(String[] args) {
		Manager monu=new Manager();
		monu.setdata();
		monu.getdata();
		
	}
}
