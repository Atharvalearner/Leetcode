class main(){
    public static void arr(int num[],int target){
        for(int i=0; i<num.length - 1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] + num[j]= target){
                    System.out.println("ans is (%d,%d)",num[i],num[j]);
                }
            }
        }
        System.out.println("pair is not found.");
    }


    public static void(){
        int num[] = {3,8,6,1,7,5};
        int target = 12;
        arr(num[],target);
    }
}