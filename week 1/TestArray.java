public class TestArray {
    public static void main (String args[]){
        int a[] = {10,20,30,40,50};
        // traversing array
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        int sum=0, avg;
        // sum & avg calculation
        for (int i=0; i<a.length; i++){
            sum += a[i];
        }
        System.out.println("Total = "+sum);
        avg = sum/(a.length);
        System.out.println("Average = "+avg);
    }
}


