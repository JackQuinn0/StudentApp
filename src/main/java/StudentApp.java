public class StudentApp {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setName("x");
        firstStudent.setEmail("x@atu.ie");
        firstStudent.setCourse("x");

        System.out.println("Details are " + firstStudent.toString());

        //second student
        Student secondStudent = new Student("x", "x@atu.ie", "x");

        //third student
        Student thirdStudent = new Student("x", "x@atu.ie", "x");

    }
}
