package jvm;

public class CustomExceptionExample {
    static void throwCustomException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (Throwable objA) {
            System.out.println("caught: " + objA);
        }
    }

    public static void main(String[] args) {
        throwCustomException();
    }
}


