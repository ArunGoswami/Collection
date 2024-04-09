package Education;

import java.util.Arrays;

class Course {
    private int id;
    private String name;
    private double fee;

    public Course(int id, String name, double fee) {
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
}

class Offer {
    private String offerText;

    public Offer(String offerText) {
        this.offerText = offerText;
    }

    public String getOfferText() {
        return offerText;
    }
}

class EducationInstitute {
    private Course[] courses;
    private Offer[] offers;

    public EducationInstitute() {
        // Initialize courses with hardcoded data
        courses = new Course[]{
                new Course(1, "Mathematics", 1000.0),
                new Course(2, "Science", 1200.0),
                new Course(3, "English", 900.0)
        };

        // Initialize offers with hardcoded data
        offers = new Offer[]{
                new Offer("Special discount: Get 20% off on all courses!"),
                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
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

class Student {
    private String name;
    private EducationInstitute institute;

    public Student(String name, EducationInstitute institute) {
        this.name = name;
        this.institute = institute;
    }

    public void viewCoursesAndFees() {
        Course[] courses = institute.getCourses();
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getId() + ". " + course.getName() + " - Fee: Rs." + course.getFee());
        }
    }

    public void viewOffers() {
        Offer[] offers = institute.getOffers();
        System.out.println("Ongoing Offers:");
        for (Offer offer : offers) {
            System.out.println(offer.getOfferText());
        }
    }

    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }
}

class EducationInstituteApp {
    public static void main(String[] args) {
        EducationInstitute institute = new EducationInstitute();

        Student john = new Student("John", institute);
        Student alice = new Student("Alice", institute);

        // Concurrent interactions using threads
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

