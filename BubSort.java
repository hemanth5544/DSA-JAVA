import java.util.Arrays;
public class BubSort {
    public static void main(String[] args) {
        int arr[]={2,1,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    /**
     * @param arr
     */
    static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){     //for each step the sort at last index we dont compare becoz tehy aree largest with respective pos
                //swap
                if(arr[j]<arr[j-1])
{
int temp=arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;

}                
            


            }

        }
    }
    
}
