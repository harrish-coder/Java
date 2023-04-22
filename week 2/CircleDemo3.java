//Multiple Constructor

class Circle{
    double x,y,r;
    Circle(double x, double y, double r){
        this.x = x; this.y = y; this.r=r;
    }
    Circle(double r){
        x=0.0; y=0.0; this.r=r;
    }
    Circle(Circle c){
        x=c.x; y=c.y; r=c.r;
    }
    Circle(){
        x=0.0; y=0.0; r=1.0;
    }
    double Circumference(){
        return 2*3.14*r;
    }
    double Area(){
        return 3.14*r*r;
    }
}

public class CircleDemo3{
    public static void main(String args[]) {
        Circle c1 = new Circle(3.0,4.0,5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();
        System.out.println("Circumference Circle 1"+c1.Circumference());
        System.out.println("Area Circle 1"+c1.Area());
        System.out.println("Circumference Circle 2"+c2.Circumference());
        System.out.println("Area Circle 2"+c2.Area());
        System.out.println("Circumference Circle 3"+c3.Circumference());
        System.out.println("Area Circle 3"+c3.Area());
        System.out.println("Circumference Circle 4"+c4.Circumference());
        System.out.println("Area Circle 4"+c4.Area());

    }
}