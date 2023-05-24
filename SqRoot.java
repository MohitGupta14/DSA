import java.util.Scanner;

public class SqRoot {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
         int num =sc.nextInt();
        
        // if (num==1 || num==2 ){
        //     System.out.println(num);
        // }
        // for(int i=0;i<num;i++){
        //     if(i*i>num){
        //         System.out.println(i-1);
        //         break;
        //     }
        // }

        // now do with binary search
       
        int low =0;
        int high= num;
        int mid=(low+high)/2;
        int flag=0;
        while(low<high){
            if(mid*mid==num){
                System.out.println(mid);
                break;
            }else if(mid*mid>num){
                high=mid;
                mid=(low+high)/2;
                if(low==high-1){
                    flag=1;
                    break;
                }

            }else if(mid*mid<num){
                low =mid;
                mid=(low+high)/2;
                if(low==high-1){
                    flag=1;
                    break;
                }
            }
            
        }
        if(flag==1){
        System.out.println(mid);
        }
    }

}
