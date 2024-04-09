package File;

import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
    	String directory="";
   // String directoryPath = "/path/to/your/directory";
    	File directory=new File(directory);
  // File directory = new File(directoryPath);
    	if(!directory.exists()) {
    		boolean success=directory.mkdirs();
    	if(success) {
    		System.out.println("directory created");
    	}
    	else {
    		System.out.println("director failed");
    	}
    	}
    	else {
    		System.err.println("directory alredy exist ");
    	}
        if (!directory.exists()) {  
            boolean success = directory.mkdirs();
            if (success) {
                System.out.println("Directory created successfully");
            } else {
                System.err.println("Failed to create directory");
            }
        } else {
            System.out.println("Directory already exists");
        }
    }
}
