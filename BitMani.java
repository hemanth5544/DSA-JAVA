public class BitMani {
    public static void main(String[] args) {
        lefShit(2);
      System.out.println(  odd(22));

    int [] arr={2,2,3,3,4,4,6};
    System.out.println(ans(arr));
    }
    static void lefShit(int n){
System.out.println(n<<1);
System.out.println(n&1);



    }
    private static boolean odd(int p){
       return (p&1)==1;
    
    }
    private static int ans(int[] arr){
        int unique=0;
         for(int n :arr){
            unique ^=n;
         }

        return unique;
    }
    
    

}

