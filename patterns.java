import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

    //     for(int i = 1;i<=n;i++){
    //         for(int j = 1 ;j<=m;j++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println("");
    // }
        



        // for(int i = 1; i <= n  ; i++){
        //     for(int j =1 ;j <= m ;j++){
        //         if(i==1||j==1||i==n||j==m){
        //             System.out.print(" * ");
        //         }
        //         else{
        //             System.out.print("   ");
        //         }
                
        //     }
        //     System.out.println();
        // }

        // *  *  * 
        // *     * 
        // *     * 
        // *  *  * 



        // for(int i = 1; i<=n ;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // * 
        // *  * 
        // *  *  * 
        // *  *  *  * 
        // *  *  *  *  *        
        


       
    //     for (int i= 1;i <=m ;i++){
    //         for(int j = 1;j<=m ;j++){
    //             if(i+j>m){
    //                 System.out.print(" * ");
    //             }
    //             else{System.out.print("   ");}
    //         }
    //         System.out.println();
    //     } 
    //             * 
    //          *  * 
    //       *  *  * 
    //    *  *  *  *         




// for(int i = 1;i<=m ;i++){
//     for(int j =1;j<=i;j++){

//         System.out.print(j);
//     }
//     System.out.println();
// }
// 1
// 12
// 123
// 1234
// 12345


        // for(int i = 1;i<=m;i++){
        // for(int j = 1 ;j<=m-i+1 ;j++)
        // {
        //     System.out.print(j);
        // }
        // System.out.println();
        // }
        // 12345
        // 1234
        // 123
        // 12
        // 1    

        // int number = 1;
        // for(int i =1;i<=m;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15      

            for(int i =1;i<=m;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2 == 0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }

                }
                System.out.println();
            }

    }
}