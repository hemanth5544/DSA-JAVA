import java.util.Arrays;
public class SelectioNsort {
    public static void main(String[] args) {
        int[] arr={5,4,3,1};
        Ss(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Ss(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;//max ele should swap with last index accrding to cahnging of i
            int maxIndex=getMax(arr,0,last);
swap(arr,maxIndex,last);
        }
    
    }
    static void swap (int [] arr,int first,int second){
        int temp=arr[first];
        arr[second]=arr[first];
        arr[second]=temp;
    }




    private static int getMax(int []arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i])
            max=i;

        }
        return max;
    }
   
    
}
