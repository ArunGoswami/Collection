package InnerclassPackage1;

//Interface Definition
interface I1 {
 int m1();
}

//Class A implementation
class A implements I1 {
 private int a;
 private int b;

 // Parameterless constructor
 public A() {
 }

 // Parameterized constructor
 public A(int a, int b) {
     this.a = a;
     this.b = b;
 }

 @Override
 public int m1() {
     return a + b;
 }

 // Getter and setter methods
 public int getA() {
     return a;
 }

 public void setA(int a) {
     this.a = a;
 }

 public int getB() {
     return b;
 }

 public void setB(int b) {
     this.b = b;
 }
}

//Class B implementation
class B implements I1 {
 private int a;
 private int b;

 // Parameterless constructor
 public B() {
 }

 // Parameterized constructor
 public B(int a, int b) {
     this.a = a;
     this.b = b;
 }

 @Override
 public int m1() {
     return a * b;
 }

 // Getter and setter methods
 public int getA() {
     return a;
 }

 public void setA(int a) {
     this.a = a;
 }

 public int getB() {
     return b;
 }

 public void setB(int b) {
     this.b = b;
 }
}

//Class C implementation
class C {
 public void display(int a1, int b1, String className) {
     I1 obj;
     try {
         // Use dynamic class loading
         Class<?> dynamicClass = Class.forName(className);
         obj = (I1) dynamicClass.getDeclaredConstructor(int.class, int.class).newInstance(a1, b1);

         // Invoke m1() method and print the result
         System.out.println("Result from " + className + ": " + obj.m1());
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

//Main class
public class User01 {
 public static void main(String[] args) {
     // Instantiate an object of class A using dynamic class loading
     C c = new C();
     c.display(3, 5, "A");

     // Instantiate an object of class B using dynamic class loading
     c.display(2, 4, "B");
 }
}
