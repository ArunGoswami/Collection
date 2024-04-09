package CollectionPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicatess {
    private List<Integer> numberList;

    
    public Duplicatess() {
        this.numberList = new ArrayList<>();
    }

   
    public Duplicatess(List<Integer> numberList) {
        this.numberList = numberList;
    }

   
    public List<Integer> getNumberList() {
        return numberList;
    }

    // Setter for numberList
    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    
    public List<Integer> getDuplicatesList() {
        if (numberList == null || numberList.isEmpty()) {
            return null; // Return null for empty or null list
        }

      

        for (Integer number : numberList) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
       
        List<Integer> inputList = List.of(33, 45, 67, 89, 33, 47, 21, 45);
        Duplicatess duplicatesObject = new Duplicatess(inputList);

        List<Integer> duplicatesList =duplicatesObject.getDuplicatesList();

        System.out.println("Original List: " + inputList);
        System.out.println("Duplicates List: " + duplicatesList);
    }
}
