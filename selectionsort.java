public class selectionsort {
    public static void main(String[] args) 
        {
            int arr[]= {4,7,2,5,9};
    
            for(int i = 0;i<arr.length;i++){
                for(int j = i+1;j<arr.length;j++){
                    int smallest = i;
                    if(arr[j]<arr[smallest]){
                        smallest = j;
                    }
                    //swap smallest and i 
                    int temp =arr[smallest];
                    arr[smallest]=arr[i];
                    arr[i]=temp;

                }
            }


    printArr(arr);
            
        }
    
        public static void printArr(int A[]){
            for(int i = 0;i<A.length;i++){
                System.out.print(A[i] + " ");
            }
            System.out.println();
            
        }        
}
    

