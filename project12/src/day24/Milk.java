package day24;

public class Milk {
    private String milk;
    private int milkprice;
    private int milktprice;

    public Milk(String milk, int milkprice) {
        super();
        this.milk = milk;
        this.milkprice = milkprice;
    }

    @Override
    public String toString() {
        return "Milk [milk=" + milk + ", milkprice=" + milkprice + ", milktprice=" + milktprice + "]";
    }

    public void setMilktprice(int milktprice) {
        this.milktprice = milktprice;
    }

    public static void main(String[] args) {
        Milk amul = new Milk("amul", 30);
        System.out.println(amul);

        amul.setMilktprice(33);
        System.out.println(amul);
    }
}

