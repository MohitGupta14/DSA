import java.util.Scanner;
public class factorial {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
      
            System.out.println( factorialFun(num));
        }
     }
    
    private static int factorialFun(int num) {
        if(num==0 || num==1){
            return 1;
        }else{
        int result=num*factorialFun(num-1);
        return result;}
    }

}
