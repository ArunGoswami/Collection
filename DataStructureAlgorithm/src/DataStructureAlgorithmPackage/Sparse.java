package DataStructureAlgorithmPackage;

import java.util.Scanner;

public class Sparse {
public static void main(String[] args) {
	int i=0,j=0;
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	int arr[][]=new int[n][m];
	for(i=0; i<n; i++) {
		for( j=0; j<m; j++) {
			arr[i][j]=scan.nextInt();
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	
	for(i=0; i<n; i++) {
		for( j=0; j<m; j++) {
	if(i==j || i>j) {
		System.out.print(arr[i][j]);
	}
	else {
		System.out.print(0);
	}
		}
		System.out.println();
}
}
}
