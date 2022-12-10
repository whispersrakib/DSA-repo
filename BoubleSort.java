/**
 * BoubleSort
 */
public class BoubleSort {
 public static void printt(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }System.out.println();
 }
    public static void main(String[] args) {
        int arr[]={7,4,7,2,3,1,9,8};
        for(int i=0;i<arr.length-1;i++){
            for( int j=0;j<arr.length-i-1;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        printt(arr);
    }
}
