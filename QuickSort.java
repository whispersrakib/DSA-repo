/**
* QuickSort
*/
public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           
        }
        i++;
        int temp2=arr[i];
        arr[i]=pivot;
        arr[high]=temp2;
 
 
        return i;
    }
 
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
 
 public static void main(String[] args) {
    int arr[]={9,4,2,6,5,8,1,5,3,134};
    int n=arr.length;
 
 
    quickSort( arr,0,n-1);
 
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }System.out.println();
 }
    
 }
