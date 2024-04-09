package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertIntoArrayList {
	private static ArrayList<String> Convert(String[] str) {
		if(str==null || str.length==0){
			return null;
		}
		else {
		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));	
		return al;
		}
		
	}
	
public static void main(String[] args) {
	String[] str= {"one","two","three"};
	ArrayList<String> astr=ConvertIntoArrayList.Convert(str);
	System.out.println(astr);
}


}
