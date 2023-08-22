 public class Recursionk {
    public static void main(String[] args) {
        System.out.println(message(50));
        
    }
    static int  message(int n){
        if(n<2){
            
            return n;
        }
        return message(n-1) + message(n-2);
    }
}
