package CollectionPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArraylistSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> al = new ArrayList<>();
        al.add("10");
        al.add("null");
        al.add("13");
        al.add("12");
        System.out.println(al);

        // Writing ArrayList to file
        FileOutputStream fos = new FileOutputStream("C://Batch//al.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close(); // Close ObjectOutputStream

        // Reading ArrayList from file
        FileInputStream fis = new FileInputStream("C://Batch//al.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<String> readAl = (ArrayList<String>) ois.readObject();
        ois.close(); // Close ObjectInputStream

        System.out.println(readAl);
    }
}
