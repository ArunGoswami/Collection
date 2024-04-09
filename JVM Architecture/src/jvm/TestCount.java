package jvm;

interface Count { 
short counter = 0; 
void countUp();
}
public class TestCount implements Count {
public static void main(String [] args) {
TestCount t = new TestCount(); 
t.countUp();
}
public void countUp() {
for (int x = 6; x>counter; x--, ++counter)
{
System.out.print(" " + counter);
}
}
}
