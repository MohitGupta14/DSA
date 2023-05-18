

class ReverseArray{
    public static void main(String[] args) {
        
        int array[]= {2,3,8,10,12,14};
        int temp=0;
        for(int i=0;i<array.length/2;i++){
            temp= array[i];
            array[i]= array[6-i-1];
            array[6-i-1]=temp;
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }

    }
}