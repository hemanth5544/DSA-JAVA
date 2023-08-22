import java.util.*;
import java.util.Arrays;

public class presentinArrayOrNot{
    public static void  check(int [] arr,int x) {
       
       boolean test=true;
            for(int elemnet : arr){
                if(x==elemnet){
                    test= true;
                    break;
                }
                
            }
            System.out.print("there"+test +x);
                
            
        }

            public static void main(String[] args) {
                
                int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
                int x=100;
                
                check(arr,x);
            }
        
        
    
}
