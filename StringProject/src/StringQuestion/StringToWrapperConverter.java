package StringQuestion;

public class StringToWrapperConverter {

    public static void main(String[] args) {
        
        String stringValue = "123";

        Integer integerValue = convertToWrapperObject(Integer.class, stringValue);
        Double doubleValue = convertToWrapperObject(Double.class, stringValue);
        Boolean booleanValue = convertToWrapperObject(Boolean.class, "true");

        // Print the converted values
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Boolean Value: " + booleanValue);
    }

    // Generic method to convert a string to a wrapper object
    public static <T> T convertToWrapperObject(Class<T> wrapperClass, String stringValue) {
        if (wrapperClass == Integer.class) {
            return wrapperClass.cast(Integer.valueOf(stringValue));
        } else if (wrapperClass == Double.class) {
            return wrapperClass.cast(Double.valueOf(stringValue));
        } else if (wrapperClass == Boolean.class) {
            return wrapperClass.cast(Boolean.valueOf(stringValue));
        } else {
            // You can add more cases for other wrapper classes as needed
            throw new IllegalArgumentException("Unsupported wrapper class: " + wrapperClass.getName());
        }
    }
}

