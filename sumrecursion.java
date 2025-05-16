public class sumrecursion {

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        printSum(i,n,sum);
    }

    public static void printSum(int i ,int n ,int sum){
        
        if(i == n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1,n,sum);
        return;

    }
}
