package ConcurrentPackage;

import java.util.HashMap;
import java.util.Map;

public class ReverseHashmap {
	
	    public static void main(String[] args) {
	        // Original hashmap
	        Map<Integer, String> originalMap = new HashMap<>();
	        originalMap.put(1, "One");
	        originalMap.put(2, "Two");
	        originalMap.put(3, "Three");

	        // Print keys in reverse order
	        printKeysInReverse(originalMap);
	    }

	    public static <K, V> void printKeysInReverse(Map<K, V> originalMap) {
	        for (int i = originalMap.size(); i >= 1; i--) {
	            System.out.println(originalMap.get(i));
	        }
	    }
	}
