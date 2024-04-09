package day31;

public class object {
public static void main(String[] args) {
	Student s1=new Student(111,"asd");
	Student s2=new Student(111,"asd");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}
