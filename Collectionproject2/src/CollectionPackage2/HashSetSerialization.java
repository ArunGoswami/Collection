package CollectionPackage2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println("Original HashSet: " + hs);

        
        FileOutputStream fos = new FileOutputStream("C://Batch27//Hashset.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            oos.writeObject(hs);
        } catch (Exception e) {
            System.out.println("Error writing to file");
        } finally {
            oos.close();
        }

        FileInputStream fis = new FileInputStream("C://Batch27//Hashset.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            HashSet<Integer> readHashSet = (HashSet<Integer>) ois.readObject();
            System.out.println("Read HashSet from file: " + readHashSet);
        } catch (Exception e) {
            System.out.println("Error reading from file");
        } finally {
            ois.close();
        }
    }
}
