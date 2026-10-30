package OOP_Constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        /*Car car1 = new Car();
        car1.make = "Honda";
        car1.model = "Civic";
        car1.color = "White";
        car1.price = 4600;

        System.out.printf("Make: %s\nModel: %s\nColor: %s\nPrice: %d$\n", car1.make, car1.model, car1.color,
                car1.price);

        Car car2 = new Car();
        car2.make = "Toyota";
        car2.model ="Camry";
        car2.color ="Black";
        car2.price = 12500;

        System.out.printf("\nMake: %s\nModel: %s\nColor: %s\nPrice: %d$\n", car2.make, car2.model, car2.color,
                car2.price);

        Car car3 = new Car();
        car3.make = "Nissan";
        car3.model = "Skyline";
        car3.color = "Blue";
        car3.price = 75000;

        System.out.printf("\nMake: %s\nModel: %s\nColor: %s\nPrice: %d$", car3.make, car3.model, car3.color, car3.price);*/

        //Task 2
        /*Programmer programmer1 = new Programmer();
        System.out.print("Enter name: ");
        programmer1.name = scanner.nextLine();
        System.out.print("Enter surname: ");
        programmer1.surname = scanner.nextLine();
        System.out.print("Enter age: ");
        programmer1.age = scanner.nextByte();
        scanner.nextLine();

        System.out.printf("Name: %s\nSurname: %s\nAge: %d\nDate of birth: %d year\n", programmer1.name, programmer1.surname, programmer1.age, Programmer.dateOfBirth(programmer1.age));

        Programmer programmer2 = new Programmer();
        System.out.print("Please enter another person name: ");
        programmer2.name = scanner.nextLine();
        System.out.print("Enter surname: ");
        programmer2.surname = scanner.nextLine();
        System.out.print("Enter age: ");
        programmer2.age = scanner.nextByte();

        System.out.printf("Name: %s\nSurname: %s\nAge: %d\nDate of birth: %d year\n", programmer2.name, programmer2.surname, programmer2.age, Programmer.dateOfBirth(programmer2.age));
*/
        //Task 1
        /*Passport person1 = new Passport(258123, "Max", "Zhao", 2001, 'M', "French");
        Passport person2 = new Passport(123532, "Christina", "Alex", 2004, 'F', "Polish");

        person1.printInfo();
        person2.printInfo();*/
        //Task 2
        Student[] students = new Student[5];
        students[0] = new Student("Maxim", "Java", (byte)26);
        students[1] = new Student("Alex", "Java", (byte)22);
        students[2] = new Student("Anton", "JS", (byte)32);
        students[3] = new Student("Shona", "Java", (byte)35);
        students[4] = new Student("Saraf", "JS", (byte)29);

        Student.countInfoGroup(students);
        //Task 3
        Student.avgAge(students);

        //Task 4
        OOP_Constructor.Clone.Student[] students1 = new OOP_Constructor.Clone.Student[5];
        students1[0] = new OOP_Constructor.Clone.Student();
    }
}
