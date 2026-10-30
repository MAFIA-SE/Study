package OOP_Constructor;

public class Student {
    String name;
    String group;
    byte age;

    public Student(){
        this.name = "Null";
        this.group = "Null";
        this.age = 0;
    }

    public Student(String name, String group, byte age){
        this.name = name;
        this.group = group;
        this.age = age;
    }

    public static void countInfoGroup(Student[] students){
        int counterJava = 0;
        int counterJS = 0;
        for (Student check : students) {
            if (check.group.equals("Java")){
                counterJava++;
            }else {
                counterJS++;
            }
        }
        System.out.printf("Java: %d\nJS: %d", counterJava, counterJS);
    }

    public static  void avgAge(Student[] students){
        int sumAge = 0;
        for (Student student : students){
            sumAge += student.age;
        }
        double average = (double) sumAge / students.length;
        System.out.printf("\nAVG age: %.1f", average);
    }
}
