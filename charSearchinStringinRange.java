import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class charSearchinStringinRange {
    public static void main(String[] args) {
        String str = "hrgfyr";
        char target= 'h' ;
        int start=1;
        int end =4;
        boolean ans = search(str,target,start,end) ;
        System.out.println(ans) ;
    } 





static boolean search(String str,char target,int start,int end)  {
       if (str.length()==0) {
           return false;
       }
       for(int i =start;i<=end;i++) {
           if(str.charAt(i)==target) {
               return true;
           }
           
       }
       return false;
   }
}