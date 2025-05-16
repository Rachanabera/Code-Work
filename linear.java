import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numbers[]= new int[n];
        for(int i= 0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        for(int i = 0;i<n;i++){
            if(numbers[i]==target){
                System.out.println("Element found at index : "+i);
            }
        }
    }
    
}
