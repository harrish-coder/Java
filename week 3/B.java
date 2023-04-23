class A{
    private int data = 10;
    public void msg(){
        System.out.println("Hello Java!"+data);
    }
}

public class B{
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}