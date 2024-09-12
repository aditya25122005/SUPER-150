public class MaxValue {
    public static void main(String[] args) {
        int [] arr={1,34,23,45,12,15,67,8};
        System.out.println(max1(arr));

    }
    // public static int max(int[] arr){
    //     int max=arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }
    public static int max1(int[] arr){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // if(arr[i]>m){
            //     m=arr[i];
            // }
            m=Math.max(m, arr[i]);
        }
        return m;
    }
    
}
