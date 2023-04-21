// public class my3Darray {
//     public static void main(String args){
//         int a3darr [] [] [] = new int [2][3][5];
//         for(int i=0; i<2; i++){
//             for (int j=0; j<3; j++){
//                 for (int k=0; k<4; k++){
//                     a3darr[i][j][k] = i*j*k;
//                 }
//             }
//         }


//         for(int i=0; i<2; i++){
//             for (int j=0; j<3; j++){
//                 for (int k=0; k<4; k++){
//                     System.out.print(a3darr[i][j][k] + " ");
//                     System.out.println();
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


public class my3Darray {
    public static void main(String[] args) {
        int a3darr[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    a3darr[i][j][k] = i * j * k;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(a3darr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
