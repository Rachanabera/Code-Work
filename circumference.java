import java.util.*;
public class circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        calCircumference(radius);
    }


    public static void calCircumference(double r){
        double circum = 2 * Math.PI * r;
        System.out.println("The circumference is : "+circum);
    }
}
