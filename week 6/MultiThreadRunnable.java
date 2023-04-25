// creating thread
class ThreadX implements Runnable{
    public void run(){
        for (int i=0; i<=5;i++){
            System.out.println("From Thread X with i= "+1*i);
        }
        System.out.println("Exiting from Thread X...");
    }
}

class ThreadY implements Runnable{
    public void run(){
        for (int j=0; j<=5;j++){
            System.out.println("From Thread Y with j= "+2*j);
        }
        System.out.println("Exiting from Thread Y...");
    }
}

class Threadz implements Runnable{
    public void run(){
        for (int K=0; K<=5;K++){
            System.out.println("From Thread Z with k= "+2*K-1);
        }
        System.out.println("Exiting from Thread Z...");
    }
}

class MultiThreadRunnable{
    public static void main(String args[]){
        Thread x = new ThreadX();
        Thread t1 = new ThreadX(x);
        Thread y = new ThreadY();
        Thread t2 = new ThreadY(y);
        Thread z = new ThreadZ();
        Thread t3 = new ThreadX(z);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Multithreading is over");
    }
}