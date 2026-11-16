package Inheritance;

public class Parent {
    private String name;
    private int age;

    public Parent(){
        this.name = "";
        this.age = 0;
    }

    public Parent(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

   public void setAge(int age){
        if (age > 0 && age < 120){
            this.age = age;
        }else {
            this.age = 0;
        }

   }
   public int getAge(){
        return age;
   }

    public void sayInfo(){
        System.out.printf("Hello my name's %s, and I'm %d years old.\n", this.name, this.age);
    }
}
