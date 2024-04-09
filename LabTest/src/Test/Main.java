package Test;

public class Main {
public static void main(String[] args) {
    EducationInstitute institute = new EducationInstitute();

    Student john = new Student("John", institute);
    Student alice = new Student("Alice", institute);

   
    Thread johnThread = new Thread(() -> {
        john.viewCoursesAndFees();
        john.viewOffers();
        john.enrollInCourse(1);
    });

    Thread aliceThread = new Thread(() -> {
        alice.viewCoursesAndFees();
        alice.viewOffers();
        alice.enrollInCourse(2);
    });

    johnThread.start();
    aliceThread.start();
}
}
