package Test;

public class Course {
	int id;
	String name;
	double fee;
	public Course(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public double getFee() {
		return fee;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}

