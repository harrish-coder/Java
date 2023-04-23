class Prime{
    public static void main(String args[]) {
        int m;
        boolean isPrime = true;
        m=Integer.parseInt(args[0]);
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}