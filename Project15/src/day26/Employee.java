package day26;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hraPer;
    private double dapPer;

    public Employee(int employeeId, String employeeName, double basicSalary, double hraPer, double dapPer) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.dapPer = dapPer;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary +
                ", hraPer=" + hraPer + ", dapPer=" + dapPer + "]";
    }

    public double calculateSalary() {
        return basicSalary + hraPer + dapPer;
    }
}

