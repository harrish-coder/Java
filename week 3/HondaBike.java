//using abstract keyword to hide information

abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}
class HondaBike{
public static void main(String args[]) {
    Honda obj = new Honda();
    obj.run();
}
}