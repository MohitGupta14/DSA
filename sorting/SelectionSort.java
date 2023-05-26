public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[]={2,2,1,4,2,5,7,5,3};

        for(int i=0;i<arr.length;i++){

            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                   min_index=j;
                }
            }
            int temp=0;

            if(min_index!=i){
            temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=arr[min_index];}
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
