package day18;

public class pattern {
public static void main(String[] args) {
	int r,c = 0;
	for( r=1; r<=5; r++) {
		c=1;
		for(int s=1; s<r; s++) {
			System.out.print(" ");
		}
		for(c=r; c<=5; c++) {
			System.out.print(c);
		}
		for(int k=r; k<5; k++) {
			System.out.print(c);
			c++;
		}
		
		System.out.println();
	}
}
}
