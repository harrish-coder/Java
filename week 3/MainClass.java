//example of access modifier with public, private, protected and default


class BaseClass{
    public int x = 10;
    private int y = 10;
    protected int z = 10;
    int a = 10;   //which is default
//public
    public int getx(){
        return x;}
    
    public int setx(int x){
        this.x = x;
	return x;}
    
//private
    private int gety(){
        return y;}
    
    private int sety(int y){
        this.y = y;
	return y;}
    
//protected
    protected int getz(){
        return z;}
    
    protected int setz(int z){
        this.z = z;
	return z;}
    
//default
    int geta(){
        return a;
    }
    void  seta(int a){
        this.a = a;
	}
    }


public class MainClass extends BaseClass{
    public static void main(String args[]) {
        BaseClass rr = new BaseClass();
        rr.z = 0;
        MainClass subclassobj  = new MainClass();
        //public modifier
        System.out.println("Value of x is: "+subclassobj.x);
        subclassobj.setx(20);
        System.out.println("Value of x is: "+subclassobj.x);
        //protectd modifier
        System.out.println("Value of z is: "+subclassobj.z);
        subclassobj.setx(30);
        System.out.println("Value of z is: "+subclassobj.z);
        //default modifier
        System.out.println("Value of a is: "+subclassobj.a);
        subclassobj.seta(20);
        System.out.println("Value of x is: "+subclassobj.a);
    }
}

//since private cannot accessable 