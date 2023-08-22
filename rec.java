public class rec {
    public static void main(String[] args) {
        System.out.print(sumofdi(123));
    //    peirn(5);
    //   System.out.println( fact(5));
       
    }
//     static void peirn(int n){
//         if(n==0){
//             return;
//         }  
//         peirn(n-1);
//     System.out.println(n);
    
    
// }
// static int fact(int p){
//     if(p<=1){
//         return 1;

//     }
//     return p*fact(p-1);
//}
static int sumofdi(int x){
    if(x==0){
        return 0;
    }
   return (x%10)+sumofdi(x/10);

}



}
