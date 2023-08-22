import java.util.Arrays;
public class BSin2Darr {
    public static void main(String[] args) {
int [][] arr={{1,2,3},
              {4,5,6},
              {7,8,9}
    };
int target=2;
    int[] ans=search(arr,target);
    System.out.println(Arrays.toString(ans));
 }

    static int[] search(int [][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0 ){
            if(target==matrix[r][c]){
                return new int[]{r,c};
            }
            if(target<matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
return new int[]{-1,-1};
        
        }
    }

    

