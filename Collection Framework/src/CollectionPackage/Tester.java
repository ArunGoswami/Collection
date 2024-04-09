package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayToList {
    public static List<String> convertToList(String[] inputArray) {
       
        if (inputArray == null || inputArray.length == 0) {
            return null;         }

        
        List<String> stringList = new ArrayList<>(Arrays.asList(inputArray));

        return stringList;
    }
}

public class Tester {
    public static void main(String[] args) {
          String[] validArray = {"One", "Two", "Three"};
        List<String> result1 = ArrayToList.convertToList(validArray);
        System.out.println("Result 1: " + result1);

        
        String[] nullArray = null;
        List<String> result2 = ArrayToList.convertToList(nullArray);
        System.out.println("Result 2: " + result2);

          String[] emptyArray = {};
        List<String> result3 = ArrayToList.convertToList(emptyArray);
        System.out.println("Result 3: " + result3);
    }
}
