package Inter;

public interface vehicle {
void run();
default void battery() {
	System.out.println("battery");
}
}
