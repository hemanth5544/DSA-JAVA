
public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts={{1,2,3,4},{7,8,9,10}};
        
    }
    public int maximumWealth(int [][] accounts){
        //person=row    
        //account=col
        int ans=Integer.MIN_VALUE;
 for(int person=0;person<accounts.length;person++){
            //finding sum of each col at respective account  and comparing with other accout
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum +=accounts[person][account];
             }
            //now we have sum of person
            //check with all 
            if(sum > ans){
                ans=sum;

            }
        }
        return ans;
    }
    
}
