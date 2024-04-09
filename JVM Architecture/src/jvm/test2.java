package jvm;

public class test2 {
public static void main(String[] args) throws Exception {
	try(NetworkResource n=new NetworkResource();
			KeyboardResource kb=new KeyboardResource() ){
		System.out.println(10/0);
	}
	catch(Exception e) {
		System.out.println("fghj");
	}
	System.out.println("main");
	
}
}
