//try with mutliple catch

class MultiCatch{
    public static void main(String args[]) {
        int i = args.length;
        try{
            //String mystring = new String[i];
            if(args[0].equals("Java"));
            System.out.println("First word is java !");
 	    System.out.println("Number of arguments =" + i);
            int x = 18/i;
            int y[] = {1, 2};
            y[i] = x;
        }
        catch(NullPointerException e)
        {System.out.println("A null pointer exception: "+e);
        }
        catch(ArithmeticException e)
        {System.out.println("Divide by 0: "+e);
        }
        catch(IndexOutofBoundsException e)
        {System.out.println("Array Index Out of Bound:  "+e);
        }
    }
}