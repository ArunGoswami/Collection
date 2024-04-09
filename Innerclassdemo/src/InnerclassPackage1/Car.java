package InnerclassPackage1;

//Define the Engine interface
interface Engine {
 int mode();
}

//Car class with inner classes for different engine modes
public class Car {
 private Engine engine;

 // Inner class for MockSuccessEngine
 private static class MockSuccessEngine implements Engine {
     @Override
     public int mode() {
         return 0;
     }
 }

 // Inner class for MockFailAndRetryEngine
 private static class MockFailAndRetryEngine implements Engine {
     @Override
     public int mode() {
         return 1;
     }
 }

 // Inner class for MockServicingEngine
 private static class MockServicingEngine implements Engine {
     @Override
     public int mode() {
         return 2;
     }
 }

 // Constructor to set the engine
 public Car(Engine engine) {
     this.engine = engine;
 }

 // Method to drive the car based on the engine mode
 public void drive(int model) {
     int engineMode = engine.mode();

     switch (engineMode) {
         case 0:
             System.out.println("Engine started");
             break;
         case 1:
             System.out.println("Engine fail, kindly try once!");
             break;
         case 2:
             System.out.println("Need servicing!!!!");
             break;
         default:
             System.out.println("Invalid Input");
     }
 }

 // User class for testing
 public static class User {
     public static void main(String[] args) {
         // Create instances of Car with different types of engine modes
         Car car1 = new Car(new MockSuccessEngine());
         Car car2 = new Car(new MockFailAndRetryEngine());
         Car car3 = new Car(new MockServicingEngine());

         // Call the drive method for each instance of Car with various model inputs
         car1.drive(0); // Engine started
         car2.drive(1); // Engine fail, kindly try once!
         car3.drive(2); // Need servicing!!!!

         // Test with an invalid input
         Car car4 = new Car(new MockSuccessEngine());
         car4.drive(3); // Invalid Input
     }
 }
}

