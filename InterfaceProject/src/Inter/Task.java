package Inter;

public abstract class Task {

String taskName;
 int priority;
 
public Task(String taskName, int priority) {
	super();
	this.taskName = taskName;
	this.priority = priority;
}
public abstract String completeTask();
public abstract String displayTaskInfo();

public String displayPriority() {
	return this.taskName;
}
}
