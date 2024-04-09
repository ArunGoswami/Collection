package InnerclassPackage;

public class Demo {
    private int id;

    public int getId() {
        return id;
    }

    class Hello {
        public int getOuterId() {
            // Accessing the private variable 'id' from the outer class
            return getId();
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Demo d = new Demo();

        // Creating an instance of the inner class using the outer class instance
        Demo.Hello h = d.new Hello();
        Demo.Hello he=d.new Hello(); 
        // Accessing the 'id' variable from the inner class
        int outerIdFromInner = h.getOuterId();
        h.getOuterId();
        System.out.println("Outer ID from inner class: " + outerIdFromInner);
    }
}
