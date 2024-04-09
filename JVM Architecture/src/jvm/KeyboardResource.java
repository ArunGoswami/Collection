package jvm;

import java.io.Closeable;

public class KeyboardResource implements Closeable{
public void close() {
	System.out.println("KeyboardResource");
}
}
