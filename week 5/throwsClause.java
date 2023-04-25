//use of throws clause in exception handling

import java.lang.*;

public class throwsClause{
    public static void main(String args[]) {
        int [] array = new int[3];
        try{
            for(int i=0;i<4;i++){
                array[i]=i;
            }
            System.out.println(array);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fillIn: "+e.fillInStackTrace());
            System.out.println("fillIn: "+e.getCause());
            System.out.println("fillIn: "+e.getLocalizedMessage());
            System.out.println("fillIn: "+e.getMessage());
            System.out.println("fillIn: "+e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("trace: ");e.printStackTrace();
            System.out.println();
            System.out.println("string: ");e.toString();
            System.out.println();
            System.out.println();
            System.out.println("oops we went too far, better go back to 0!");
            //throw (Exception) new Exception().initCause(e);
        }
        finally{
            System.out.println(array);
        }
    }
}