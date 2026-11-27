package Task_Encapsulation_Inharitance;

public class Mother {
    private String name;
    private int age;
    private String eyeColor;

    public Mother(){
    }

    public Mother(String name, int age, String eyeColor){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String statusPerson(){
        return name + " this is mother";
    }
}
