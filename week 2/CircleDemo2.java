//program which uses constructor

class Circle{
    double x,y,r;
    double Circumference(){
        return 2*3.14*r;
    }
    double Area(){
        return 3.14*r*r;
    }
    Circle(double a, double b, double c){
    	x=a;
	y=b;
	r=c;
}
}

class CircleDemo2{
    public static void main(String args[]){
        Circle c1 = new Circle(3.0,4.0,5.0);
        Circle c2 = new Circle(-4.0,8.0,10.0);
	System.out.println("Circumference: "+c1.Circumference());
	System.out.println("Circumference: "+c2.Circumference());
        System.out.println("Area: "+c1.Area());
	System.out.println("Area: "+c2.Area());
    }
}