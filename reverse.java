public class reverse {
    public static void main(String[] args) {
        
    StringBuilder rev = new StringBuilder(" ");
    StringBuilder  str = new StringBuilder("hello");
    for(int i = str.length()-1;i>=0;i--){
        rev = rev.append(str.charAt(i));
    }
System.out.println(rev);
    }

}
