//using scanner method to get input from user

import java.util.Scanner;

class scan{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b){
            System.out.printf("Between %d and %d, maximum is %d \n",a,b,a);
        }
        else if(a<b){
            System.out.printf("Between %d and %d, maximum is %d \n",a,b,b);
        }
    }
}