package Encapsulation;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(int width, int length){
        setLength(length);
        setWidth(width);
    }

    public void setLength(int length){
        if(length > 0){
            this.length = length;
        }else {
            System.out.println("Error, you don't set 0 and after him.");
        }
    }

    public void  setWidth(int width){
        if (width > 0){
            this.width = width;
        }else {
            System.out.println("Error, you don't set 0 and after him.");
        }
    }


    public int foundArea(){
        return length * width;
    }
}
