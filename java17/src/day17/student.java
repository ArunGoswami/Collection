package day17;

public class student {
	private String studentName;
	private  int studentId;
	private String course;
	private Address address;
	public student(String studentName, int studentId, String course, Address address) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.course = course;
		this.address = address;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", studentId=" + studentId + ", course=" + course + ", address="
				+ address + "]";
	}
	
}
