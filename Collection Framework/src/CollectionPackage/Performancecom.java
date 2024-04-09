package CollectionPackage;

import java.util.ArrayList;
import java.util.Vector;

public class Performancecom {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Object> al = new ArrayList<Object>();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Vector<Object> v = new Vector<Object>();
        for (int i = 0; i < 1000000; i++) {
            v.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Vector Time: " + (end - start) + " ms");
    }
}
