package Task_Encapsulation_Inharitance;

public class Saber extends Spartans{
    private String sword;
    private String shield;

    public Saber(){
    }

    public Saber(int count, String region, String sword, String shield) {
        super(count, region);
        setSword(sword);
        setShield(shield);
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public void slash(){
        System.out.println("sword strike");
    }

    public void block(){
        System.out.println("Block with a shield");
    }
}
