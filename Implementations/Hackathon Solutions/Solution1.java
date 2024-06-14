// Define a class Rweactangle with private attributes length and width, and 
// public methods to get/set these attributes, and to calculate area and perimeter 

class Rectangle{
    private int length;
    private int width;

    public Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }
    public int getLength() {
        return this.length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public double calculateArea(){
        return this.length*this.width;
    }
    public double calculatePerimeter(){
        return 2*(this.length + this.width);
    }
}
public class Solution1{
    public static void main(String[] args) {
        Rectangle test = new Rectangle(23, 34);

        test.setLength(40);
        test.setWidth(45);
        System.out.println(test.calculateArea());
        System.out.println(test.calculatePerimeter());
    }
}