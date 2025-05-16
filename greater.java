import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        greaterNum(num1,num2);

    }

    public static void greaterNum(int a,int b ){
        if(a>b){
            System.out.println(a+" is the Greater Number .");
        }
        else{
            System.out.println(b+" is the Greater Number .");
        }
        return;
    }
    
}
