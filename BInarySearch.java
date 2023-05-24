import java.util.Scanner;

public class BInarySearch {
    public static void main(String[] args) {
        
        int arr[]={2,3,5,6,8,9};
        int low =0;
        int high =5;
        int mid = (low+high)/2;
       
        
        Scanner sc = new Scanner(System.in);
        int elem=sc.nextInt();
        int flag=0;
        while(low<high){
           
            if(arr[mid]==elem){
                flag=1;
                break;
            }
            else if(arr[mid]>elem){
                high = mid-1;
                mid = (low+high)/2;
            }else{
                low =mid+1;
                mid = (low+high)/2;
            }
        }

        if(flag==1){
             System.out.println("Element is present ");
        }else{
            System.out.println("Element is absent");   
        }

    
    }
}
