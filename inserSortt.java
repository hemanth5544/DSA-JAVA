import java.util.Arrays;
public class inserSortt {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        insert(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insert(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){//backtracking every j by 1 and must be greater than 0index
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;        //prevent swaping partially sorted arr
                }
            }
        }
    }
                private static void swap(int[] arr, int a, int b) {
                
                    int temp=arr[a];
                    arr[b]=arr[a];
                    arr[b]=temp;
                }
            }
        



        

        

    
    


