public class insertionSort {
    public static void main(String[] args) {
        int arr[]={23,12,4,12,1,23,1,45,2};
        
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while(j>=0 && arr[j]>arr[j+1]){
              int temp=0;
              temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
              j--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
