public class insertsort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};

        for(int i = 1;i<arr.length;i++){
                int j = i-1;
                int key = arr[i];
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                    
                }
                arr[j+1]=key;
            }
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
 }
}
    

