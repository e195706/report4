public class Main {
    public static void main(String[] args) {
       try {
           String str;
           str = null;

           System.out.println(str.length());
       }catch(NullPointerException e){
           System.out.println("例外が発生中！");
           System.out.println(e.getMessage());
        }
    }
}
