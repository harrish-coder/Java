//super:invoking parent class constructor

class Animal{
    Animal(){System.out.println("I am animal");}
}
class Human extends Animal{
    Human(){
    super();
    System.out.println("I am Human");
}
}

class TestSuper2{
    public static void main(String args[]) {
        Human h = new Human();
        
    }
}