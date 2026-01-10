package OOPs.Interface;

import java.util.HashMap;

interface Resizable{
     public void reSizeWidth(int width);
     public void reSizeHeight(int height);
}
class Rectangle implements Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
        System.out.println("Initial width: "+width);
        System.out.println("Initial height: "+ height);
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

    public void reSizeWidth(int width){
        this.width=width;
        System.out.println("ReSized Width: "+width);
    }
    public void reSizeHeight(int height){
        this.height=height;
        System.out.println("ReSized Height: "+height);
    }
    public String toPrint(){
        return "Widht: " + width+" Height: "+height;
    }
}
public class MainResizable {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20);
        rec.reSizeHeight(40);
        rec.reSizeWidth(25);
        System.out.println(rec.toPrint());


    }
}
