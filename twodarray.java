import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int A[][] = new int[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                A[i][j]=sc.nextInt();
            }
        }
        
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
