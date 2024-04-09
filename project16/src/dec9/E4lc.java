package dec9;

import java.util.Scanner;

public class E4lc {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
  for(int i=1; i<n; i++) {
	  Employee employee=Employee.getEmployeeobject();
	  System.out.println(employee);
  }
}
}
