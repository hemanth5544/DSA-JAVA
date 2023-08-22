public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,1,-2444,-55,0};
        System.out.print(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
    int count=0;
        for(int num : nums ){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
    static boolean even (int num){
        int noOfdigits=digits(num);
        if(noOfdigits %2 ==0){
        return true;

        }
        return false;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    
}

