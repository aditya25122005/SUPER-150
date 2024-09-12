public class findIndex{
    public static void main(String[] args) {
        int [] arr={2,3,12,34,56,4,5};
        int item=3;
        System.out.println(find(arr,item));


    }
    public static int find(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;

    }
}