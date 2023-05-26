public class BubbleSorting {
    public static void main(String[] args) {
        int arr[]={1,2,12,42,34,34};
        
        for(int i=0;i<arr.length;i++){
            boolean swapped =false;
           for(int j=1;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
               int temp=0;
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            };
            swapped =true;
           }
           if(!swapped){
            break;
           }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int i, int j) {
        int temp=0;
        temp=i;
        i=j;
        j=temp;
    }
    
}
