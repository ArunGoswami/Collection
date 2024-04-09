package Education;

public class Student {
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	public void viewCoursesAndFees() {
		 Course[] courses = institute.getCourse();
       System.out.println("Available Courses:");
       for (Course course : courses) {
           System.out.println(course.getId() + ". " + course.getName() + " - Fee: Rs." + course.getFee());
       }
	}
public void viewOffers() {
	 Offer[] offers = institute.getOffer();
   System.out.println("Ongoing Offers:");
   for (Offer offer : offers) {
       System.out.println(offer.getOfferText());
   }
	}
public void enrollInCourse(int courseId) {
 institute.enrollStudentInCourse(courseId, name);

}
//	Attributes:
//
//		-> name (String): Name of the student.
//
//		-> institute (EducationInstitute): Reference to the education institute where the student interacts.
//
//
//
//		Methods:
//
//		-> Student(String name, EducationInstitute institute): Constructor to initialize the student with their name and the education institute reference.
//
//		-> viewCoursesAndFees(): Displays the available courses and their fees.
//
//		-> viewOffers(): Displays the ongoing offers.
//
//		-> enrollInCourse(int courseId): Enrolls the student in the specified course using the education institute's enrollment process.

}

