package CollectionPackage2;

public class CustomStringHashCode 
{
    public static int customHashCode(String str) 
    {
        if (str == null) 
        {
            return 0; // Return a default value for null strings
        }

        int hashCode = 0;

        for (int i = 0; i < str.length(); i++) 
        {
            char charValue = str.charAt(i);
            hashCode = 31 * hashCode + charValue;
        }

        return hashCode;
    }

    public static void main(String[] args) {
        String exampleString = "Suraj";
        
        // Using the built-in hashCode method
        int hashCodeBuiltIn = exampleString.hashCode();
        System.out.println("Built-in hashCode: " + hashCodeBuiltIn);

        // Using the customHashCode method
        int customHashCode = customHashCode(exampleString);
        System.out.println("Custom hashCode: " + customHashCode);
    }
}
