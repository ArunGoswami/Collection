package m;

public class Manager {
private int managerId;
private String managerName;
public Manager(Employee emp) {
	super();
	managerId = emp.getEmployeeId();
	managerName = emp.getEmployeeName();
}
@Override
public String toString() {
	return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
}


}
