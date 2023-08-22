import java.util.ArrayList;
import java.util.*;
class linearsearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
        static int linearSearch(int[] arr,int target){
            if(arr.length==0){
                return -1;
            }
            for(int index=0;index<arr.length;index++){
                if(arr[index]==target){
                    return index;
                }
            }
            return -1;
        }
    }