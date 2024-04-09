package Inter;

public class AssignmentTask extends Task{
	String dueDate;

	public AssignmentTask(String taskName, int priority,String dueDate) {
		super(dueDate, priority);
		this.dueDate = dueDate;
	}

	@Override
	public String completeTask() {
		// TODO Auto-generated method stub
		return "few  days";
	}

	@Override
	public String displayTaskInfo() {
		// TODO Auto-generated method stub
		return "some days";
	}

	@Override
	public String toString() {
		return "AssignmentTask [dueDate=" + dueDate + ", completeTask()=" + completeTask() + ", displayTaskInfo()="
				+ displayTaskInfo() + "]";
	}
	
}
