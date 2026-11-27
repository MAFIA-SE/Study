package Task_Encapsulation_Inharitance;

public class Phone extends Technique{
    private String internet;

    public Phone(String name, String brand, String version, String internet){
        super(name, brand, version);
        setInternet(internet);
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    @Override
    public String turnOn() {
            return internet + " turn on";
    }

    @Override
    public String turnOff() {
        return internet + " turn off";
    }


}
