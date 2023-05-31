import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ///A^b//
        System.out.println(powerFun(a,b));
    }

    private static int powerFun(int a, int b) {
        if(b==1 ){
            return a;
        }
        else if(b%2==0){
            
            int result= powerFun(a, b/2);
            return result*result;
        }else{
            int result= powerFun(a, b/2);
            return result*result*a;
        }
    }
}
