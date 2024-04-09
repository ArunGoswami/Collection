package Inter;

public class HomeWorkTask extends Task{
	String dueDate;

	public HomeWorkTask(String taskName, int priority,String dueDate) {
		super(dueDate, priority);
		this.dueDate = dueDate;
	}

	@Override
	public String completeTask() {
		// TODO Auto-generated method stub
		return "task completed";
	}

	@Override
	public String displayTaskInfo() {
		// TODO Auto-generated method stub
		return "task completed";
	}

	@Override
	public String toString() {
		return "HomeWorkTask [dueDate=" + dueDate + ", completeTask()=" + completeTask() + ", displayTaskInfo()="
				+ displayTaskInfo() + "]";
	}

	
	
}
