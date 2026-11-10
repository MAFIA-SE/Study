package Encapsulation;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String[] courses;

    public Student(){
        this.name = "";
        this.surname = "";
        this.age = 0;
        this.courses = new String[]{};
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }



    public void setAge(int age) {
        if (age > 0 && age < 120){
            this.age = age;
        }else {
            this.age = 0;
        }

    }

    public int getAge(){
        return age;
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }

    public  String[] getCourses(){
        return courses;
    }
}
