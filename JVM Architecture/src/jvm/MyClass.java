package jvm;

public class  MyClass {
	 static int gap = 10;
	 double length;
	 final boolean active;
	 { 
		 int x=10;
		 active = true; 
	 }
	
	 { 
		 gap += 5;
		 }
	 { 
		 gap = 5; length = (active ? 100 : 200) + gap;
		 }
	 {
		 ;
		 }
	 {
		 length = 4.2;
		 }
	 { 
		 active = (gap > 5); length = 5.5 + gap;}
}