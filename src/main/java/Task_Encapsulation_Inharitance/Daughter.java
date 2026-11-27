package Task_Encapsulation_Inharitance;

public class Daughter extends Mother {
    private String hairColor;
    private int height;

    public Daughter(){
    }

    public Daughter(String name, int age, String eyeColor, String hairColor, int height){
        super(name, age, eyeColor);
        setHeight(height);
        setHairColor(hairColor);
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String statusPerson(){
        return getName() + " this is daughter";
    }
}
