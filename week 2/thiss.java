//best example to explain this keyword

class A{
    void m(){
        System.out.println("M");
    }
    void n(){
        System.out.println("N");
        this.m();
    }
}

class thiss{
    public static void main(String args[]) {
        A a1 = new A();
        a1.n();
    }
}