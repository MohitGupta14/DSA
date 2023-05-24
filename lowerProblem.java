import java.util.Scanner;

public class lowerProblem {
    public static void main(String[] args) {
        
        int arr[]={3,5,7,8,8,9};
        int flag=0;  
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
        for(int i=0;i<arr.length;i++){
          
            if(arr[i]==target){
                System.out.print(i);
                break;
            }else{
                flag=1;
            }
        }

        if(flag==1){
            System.out.print("Element not found");
        }
    }
}
