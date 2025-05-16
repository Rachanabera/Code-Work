import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = printAverage(a,b,c);
        System.out.println("Average of the three numbers is "+average);


    }
    
    public static int printAverage(int a , int b ,int c ){
        int avg = (a+b+c)/3 ;
        return avg;
    }
}
