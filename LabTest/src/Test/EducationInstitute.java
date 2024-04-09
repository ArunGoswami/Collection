package Test;

public class EducationInstitute {
	
  Course[] courses;
  Offer[]  offers;
	
public EducationInstitute() {
	super();
	courses = new Course[]{
          new Course(1, "Mathematics", 1000.0),
          new Course(2, "Science", 1200.0),
          new Course(3, "English", 900.0)
  };
	offers = new Offer[]{
          new Offer("Special discount: Get 20% off on all courses!"),
          new Offer("Limited time offer: Enroll in any two courses and get one course free!")
  };
}


public Course[] getCourse() {
	return courses;
}


public Offer[] getOffer() {
	return offers;
}
public synchronized void enrollStudentInCourse(int courseId, String studentName) {
  for (Course course : courses) {
      if (course.getId() == courseId) {
          System.out.println(studentName + " has enrolled in the course: " + course.getName());
          return;
      }
  }
  System.out.println(studentName + ": Invalid course ID");
}
}



