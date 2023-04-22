import java.io.*;
class Circle{
    int r;
    double Circumference(){
        return 2*3.14*r;
    }
    double Area(){
        return 3.14*r*r;
    }
}
public class CircleDemo{
    public static void main(String args[]){
        Circle c1 = new Circle();
	Circle c2 = new Circle();   //multiple obj declaration
        c1.r = 5;
	c2.r = 10;
        System.out.println("Circumference: "+c1.Circumference());
	System.out.println("Circumference: "+c2.Circumference());
        System.out.println("Area: "+c1.Area());
	System.out.println("Area: "+c2.Area());
    }
}