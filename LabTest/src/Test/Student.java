package Test;

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
       System.out.println("Available");
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
}
