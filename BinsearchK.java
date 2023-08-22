public class BinsearchK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=8;
        int ans=binsearchK(arr,target);
        System.out.println(ans);
        
    }
   static int  binsearchK(int[] arr,int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid=(start+end)/2;//its good but the mid value excced the int range in java means 214578..
                                  //better to use start+(start-end)/2;

if(target<arr[mid]){
    end=mid-1;
}
else if(target>arr[mid]){
    start=mid+1;
}else{
    return mid;
}
        }
        return -1;


    }
    
}
