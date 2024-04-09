package Exception1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
public static void main(String[] args) throws IOException {
	BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	String age=br.readLine();
	int ag=Integer.parseInt(age);
	System.out.println(ag);
	}
}
