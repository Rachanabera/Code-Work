import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
    System.out.println(factorial(num));

        
    }

    public static int factorial(int n){
        int fact=1;
        if(n==0||n==1){
            return 1;
        }
        else{
            for(int i =n ;i>=1;i--){
                fact = fact*i;
            }
            return fact;

        }
    
    }
        
    }
    

