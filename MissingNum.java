class MissingNum{
    public static void main(String[] args) {
        
        int array[]={1,2,4,7,6,5};
        int temp=1;
        for(int i=0;i<array.length;i++){
            if(array[i]==temp){
                temp++;
            }else{
                System.out.println(temp);
                break;
            }
        }
    }
}
