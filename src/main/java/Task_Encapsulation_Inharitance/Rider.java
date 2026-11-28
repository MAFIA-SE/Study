package Task_Encapsulation_Inharitance;

public class Rider extends Spartans{
    private String animal;
    private String weapon;

    public Rider(){
    }

    public Rider(int count, String region, String animal, String weapon) {
        super(count, region);
        setAnimal(animal);
        setWeapon(weapon);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void gallop(){
        System.out.println("To gallop");
    }

    public void charge(){
        System.out.println("To attack at full speed");
    }
}
