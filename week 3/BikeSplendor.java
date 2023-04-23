//super:refer parent class instance variable

class Bike{
    void run(){System.out.println("This is Bike");}
}

class Splendor extends Bike{
    void run(){System.out.println("running in 60km per hour");}
}

public class BikeSplendor{
public static void main(String args[]) {
    Bike b = new Bike();
    b.run();
    Splendor s = new Splendor();
    s.run();
    Bike bs = new Splendor();  //up casting
    bs.run();
}
}