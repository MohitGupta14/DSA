import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(fibo(num));

    }
   
    private static int fibo(int num) {
        int result=0;
        if(num<=1){
            return num;
        }
        else {
            result= fibo(num-1)+fibo(num-2);
            return result;
        }
       
  
    }
}
