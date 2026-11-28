package Task_Encapsulation_Inharitance;

public class Archer extends Spartans{
    private String bow;
    private int arrow;

    public Archer() {
    }

    public Archer(int count, String region, String bow, int arrow) {
        super(count, region);
        setBow(bow);
        setArrow(arrow);
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public void nock(){
        System.out.println("To nock an arrow on the bowstring");
    }

    public void shoot(){
        System.out.println("To fire a shot");
    }
}
