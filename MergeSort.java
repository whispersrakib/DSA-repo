public class MergeSort {

    public static void mergeConquer(int arr[],int si ,int mid,int ei) {
        
        int newarr[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int m=0;
        while(indx1 <= mid && indx2 <= ei) {
            if(arr[indx1]<= arr[indx2]) {
                newarr[m++]=arr[indx1++];
                
            }
            else {
                    newarr[m++]=arr[indx2++];
                    
            }
        }
        while(indx1<=mid) {
            newarr[m]=arr[indx1];
            m++;
            indx1++;
        }
        while(indx2<=ei) {
            newarr[m]=arr[indx2];
            m++;
            indx2++;
        }
        
    
        
    for(int i=0 ,j=si;i<=newarr.length;i++,j++) {
            arr[j]= newarr[i];
    }
    }
    
    public static void mergeDivide(int arr[],int si ,int ei ) {
        if(si>=ei) {
            return;
        }
        int mid= si+(ei-si)/2;
        mergeDivide(arr,si,mid);
        mergeDivide(arr,mid+1,ei);
        mergeConquer(arr,si,mid,ei);	
    }
    
    
    
    
    
    
    
        public static void main(String[] args) {
            int arr[]= {4,3,65,34,87,34,12,46};
            int n=arr.length;
            mergeDivide(arr,0,n-1);
            for(int i=0;i<n;i++) {
                System.out.println(arr[i]+" ");
            }
            System.out.println();
            }
    }