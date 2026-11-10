package Encapsulation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1
        /*Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println(rectangle.foundArea());*/

        //Task 2
        Student student = new Student();

        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        student.setName(inputName);

        System.out.print("Enter your surname: ");
        String inputSurname = scanner.nextLine();
        student.setSurname(inputSurname);

        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();
        student.setAge(inputAge);


        System.out.print("Enter the number of courses you are taking: ");
        int inputCoursesSize = scanner.nextInt();

        String[] inputCourses = new String[inputCoursesSize];
        scanner.nextLine();

        System.out.print("Enter you go to the courses: ");
        for (int i = 0; i < inputCourses.length; i++) {
           inputCourses[i] = scanner.nextLine();
        }
        student.setCourses(inputCourses);

        System.out.printf("Name: %s\nSurname: %s\nAge: %d\n",student.getName(), student.getSurname(), student.getAge());
        System.out.println("Courses: ");
        for (int i = 0; i < student.getCourses().length; i++) {
            System.out.println(student.getCourses()[i]);
        }

    }
}
