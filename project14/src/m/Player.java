package m;

public class Player {
private String name1,name2;

public Player(String name1, String name2) {
	super();
	this.name1 = name1;
	this.name2 = name2;
}
public Player(Player p) {
	this.name1=name2;
	this.name1=name2;
}
@Override
public String toString() {
	return "Player [name1=" + name1 + ", name2=" + name2 + "]";
}
public static void main(String[] args) {
	Player sonu=new Player("sonu","monu");
	System.out.println(sonu);
	Player monu=new Player(sonu);
	System.out.println(sonu);
}
}
