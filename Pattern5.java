public class Pattern5 {
    public static void main(String[] args) {
       pattern5(9); 
    }
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;row++){
                System.out.print('*');
                if(row>=5){
                    pattern4();

                }

            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col +" ");            
            }
            System.out.println();
        }
        
    }
}
