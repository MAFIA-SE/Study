package Inheritance;

public class Sub2 extends Parent{
    private String programLanguage;
    private String target;

    public Sub2(){
        super();
        this.programLanguage = "";
        this.target = "";
    }

    public Sub2(String name, int age, String programLanguage, String target){
        super(name, age);
        setProgramLanguage(programLanguage);
        setTarget(target);
    }

    public void setProgramLanguage(String programLanguage){
        this.programLanguage = programLanguage;
    }

    public String getProgramLanguage(){
        return programLanguage;
    }

    public void setTarget(String target){
        this.target = target;
    }

    public String getTarget(){
        return target;
    }

    @Override
    public void sayInfo(){
        System.out.printf("I study %s, and I have a target, get %s", this.programLanguage, this.target);
    }
}
