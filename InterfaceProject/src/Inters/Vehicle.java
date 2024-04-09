package Inters;

public interface Vehicle {
void run();
void horn();
default void digitalmeter() {
	System.out.println("can");
}
}
