import java.util.*;
import java.util.Arrays;
public class Serach2dArray

 {
    public static void main(String[] args) {
        int[][] arr={ 
            {1,2,3},
             {4,5,6},
             {7,8,9}

    };
    int target=5;
    int[] ans=search(arr,target);
    System.out.println(Arrays.toString(ans));
        
    
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                return new int[]{row,col};//written new int becox int not intilised before
            }
        }
    
    
    return new int[]{-1,-1};
    }
    
}
 