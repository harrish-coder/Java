//usage of super class

class Animal{
    String color="white";
}
class dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class TestSuper{
    public static void main(String args[]) {
        dog d = new dog();
        d.printColor();
    }
}