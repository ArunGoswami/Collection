package day26;

public class Trainer {
    private int trainerId;
    private String trainerName;
    private double basicSalary;
    private double hraPer;
    private double dapPer;

    public Trainer(int trainerId, String trainerName, double basicSalary, double hraPer, double dapPer) {
        super();
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.dapPer = dapPer;
    }

    @Override
    public String toString() {
        return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", basicSalary=" + basicSalary +
                ", hraPer=" + hraPer + ", dapPer=" + dapPer + "]";
    }

    public double calculateSalary() {
        return basicSalary + hraPer + dapPer;
    }
}


