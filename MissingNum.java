public class MissingNum {
    public static void main(String[] args) {
        
    }
    static void find(int [] arr){
        int i=0;
        int correct=arr[i];
        while(i<arr.length){
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);

            }
            else{ i++;
            }
        }



        
    }
        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
    

