package CollectionPackage;

import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<>();
 list.add("12");
 list.add("16");
 list.add("34");
 list.add("78");
 list.remove(Integer.valueOf(16));
 System.out.println(list);
 }
}
