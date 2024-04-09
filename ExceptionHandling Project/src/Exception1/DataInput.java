package Exception1;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInput {
public static void main(String[] args) throws Exception {
	DataInputStream d=new DataInputStream(System.in);
	    String s=d.readLine();
	    System.out.println("your name is "+s);
	    }
}
