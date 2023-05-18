public class Duplicate {
    public static void main(String[] args) {
        
        int array[]={2,4,4,7,10};
        int temp=0;
        
        for(int i=0;i<array.length;i++){           
         for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j]){
                temp=array[i];
                System.out.println(temp);
            }
         }
            
        }
    }
}
