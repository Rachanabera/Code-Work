public class power{

    public static int powerNum(int x , int n ){
        if(n == 0){
            return 1;
        }
        int power = x * powerNum(x,n-1);
        return power;
    }


    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(powerNum(x,n));
    }
}