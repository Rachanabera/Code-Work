public class factorialrecursion {
    public static int  printFact(int n){
        int fact = 1;
        if(n ==0|| n ==1){
            return 1;
        }
        
        fact = n *printFact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("Fcatorial is "+printFact(n));
    }
}
