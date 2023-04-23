class RecursiveFactorial{
    int n;
    int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }

    public static void main(String args[]) {
        RecursiveFactorial r = new RecursiveFactorial();
        r.n = Integer.parseInt(args[0]);
        System.out.println("Factorial of "+ n +":"+r.factorial(r.n));
    }
}
}