import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here

class Square extends Shape{
    Square(int x){
        this.width = x;
    }
    @Override public void area(){
        double area1 = width * width;
        System.out.println("Area of square is " + area1);
    }
}
class Circle extends Shape{
    Circle(int y){
        this.width = y;
    }
    @Override public void area(){
        double area2 = Math.PI *width *width;
        System.out.println("Area of circle is " + area2);
    }
}


public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}