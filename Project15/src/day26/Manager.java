package day26;

public class Manager {
    private int managerId;
    private String managerName;
    private double basicSalary;
    private double hraPer;
    private double dapPer;

    public Manager(int managerId, String managerName, double basicSalary, double hraPer, double dapPer) {
        super();
        this.managerId = managerId;
        this.managerName = managerName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.dapPer = dapPer;
    }

    @Override
    public String toString() {
        return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary +
                ", hraPer=" + hraPer + ", dapPer=" + dapPer + "]";
    }

    public double calculateSalary() {
        return basicSalary + hraPer + dapPer;
    }
}































//The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each. 
//
//Note : Attributes/Fields must be non-Private for the classes.
//
//Create the following BLC classes as described below.
//
//Class Employee
//Fields: employeeId: int, employeeName : String, basicSalary : double, HRAPer : double, DAPer : double
//
//Public Method: calculateGrossSalary() - returns a double
//Calculate the gross salary as : basicSalary +HRAPer +DAPer
//
//Class Manager
//Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
//Public Method: calculateGrossSalary() - returns a double
//Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance
//
//Class Trainer
//Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
//
//Public Method: calculateGrossSalary() - returns a double
//Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)
//
//Class Sourcing
//Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
//Public Method: calculateGrossSalary() - returns a double
//
//Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)
//
//
//Class TaxUtil
//Fields: None
//Public Methods:
//calculateTax(Employee) - returns a double
//calculateTax(Manager) - returns a double
//calculateTax(Trainer) - returns a double
//calculateTax(Sourcing) - returns a double
//
//Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%
//
//Note : Attributes/Fields must be non-Private for the above classes.
//
//A ClassObject class is given to you with the main Method. Use this class to test your solution.
