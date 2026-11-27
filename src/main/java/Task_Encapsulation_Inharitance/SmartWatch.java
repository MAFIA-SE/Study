package Task_Encapsulation_Inharitance;

public class SmartWatch extends Technique{
    private String display;

    public SmartWatch(){
    }

    public SmartWatch(String name, String brand, String version, String display){
        super(name, brand, version);
        setDisplay(display);
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String turnOn(){
        return display + " turn on";
    }

    @Override
    public String turnOff(){
        return display + " turn off";
    }

}
