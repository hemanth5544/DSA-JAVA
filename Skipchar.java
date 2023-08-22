public class Skipchar {
    public static void main(String[] args) {
  skip("","abcddea");
    }
    static void skip(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=u.charAt(0);
        if(ch=='a'){ 
            skip(p,u.substring(1));

        }
        else{
            skip(p+ch,u.substring(1));
        }

    }
}
