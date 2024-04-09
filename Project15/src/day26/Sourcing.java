package day26;

public class Sourcing {
    private int sourcingId;
    private String sourcingName;
    private double basicSalary;
    private double hraPer;
    private double dapPer;

    public Sourcing(int sourcingId, String sourcingName, double basicSalary, double hraPer, double dapPer) {
        super();
        this.sourcingId = sourcingId;
        this.sourcingName = sourcingName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.dapPer = dapPer;
    }

    @Override
    public String toString() {
        return "Sourcing [sourcingId=" + sourcingId + ", sourcingName=" + sourcingName + ", basicSalary=" + basicSalary +
                ", hraPer=" + hraPer + ", dapPer=" + dapPer + "]";
    }

    public double calculateSalary() {
        return basicSalary + hraPer + dapPer;
    }
}

