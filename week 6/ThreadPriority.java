class A extends Thread{
    public void run(){
        System.out.println("A is started ");
        for (int i=1; i<=4;i++){
            System.out.println("From Thread A: i= "+i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("B is started ");
        for (int j=1; j<=4;j++){
            System.out.println("From Thread B: i= "+j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("C is started ");
        for (int k=1; k<=4; k++){
            System.out.println("From Thread C: i= "+k);
        }
        System.out.println("Exit from C");
    }
}

class ThreadPriority{
    public static void main(String args[]) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadC.setPriority(Thread.MIN_PRIORITY);
        System.out.println("started thread A");
        threadA.start();
        System.out.println("started thread B");
        threadB.start();
        System.out.println("End of main thread");
    }
}