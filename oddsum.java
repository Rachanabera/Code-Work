import java.util.*;
public class oddsum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOdd(n);
        System.out.println("Sum : "+sum);

    }

    public static int sumOdd(int n){
        int sum = 0 ;
        for(int i=1;i<=n;i++){
                if(i%2!=0){
                sum = sum + i;
                }
            }
        return sum;
    }
}