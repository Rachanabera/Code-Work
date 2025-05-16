import java.util.*;

public class functions {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Number 1 : ");
     int num1 = sc.nextInt();
     System.out.print("Number 2 : ");
     int num2 = sc.nextInt();
    printSum(num1,num2);
    int product = multiply(num1,num2);
    System.out.println("Product of 2 numbers is : "+product);

    }

    public static void printSum(int a , int b  ){
        int sum = a + b ;
        System.out.println("SUM = "+sum);
    }

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    
}
