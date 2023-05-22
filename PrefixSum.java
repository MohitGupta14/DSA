import java.util.Scanner;

// public class PrefixSum {
//     public static void main(String[] args) {
        
//         int arr[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}
//         };
//         int temp=0;
//         int a=0;
//         int b=2;
//         int c=3;
//         int d=3;

//         for(int i=a;i<=c;i++){
//             for(int j=b;j<=d;j++){
//                    temp=temp+arr[i][j];
//             }
//         }

//         System.out.println(temp);
//     }
// }

public class PrefixSum{
    public static void main(String[] args) {
        
        int arr[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};

        for(int i=1;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
        for(int i=0;i<4;i++){
            for(int j=1;j<4;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }

        int r1,s1;
        int r2,s2;
        Scanner sc = new Scanner(System.in);
        r1= sc.nextInt(); 
        s1= sc.nextInt(); 
        r2= sc.nextInt(); 
        s2= sc.nextInt();
        
        int answer;

       if(r1-1>=0 && s1-1>=0 ){
        answer = arr[r2][s2]-arr[r2][s1-1]-arr[r2][s1-1]+arr[r1-1][s1-1];}
        else if(r1-1>=0){
        answer = arr[r2][s2]-arr[r1-1][s2];
        }
        else if(s1-1>=0){
            answer =arr[r2][s2]-arr[r2][s1-1];
        }
            else{
         answer = arr[r2][s2];
        }
        
        System.out.println(answer);
        
    }
}
