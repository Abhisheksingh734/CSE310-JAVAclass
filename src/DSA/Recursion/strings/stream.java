package DSA.Recursion.strings;

public class stream {
    public static void main(String[] args) {
        skipA("baccadh","" );
        // String ans = skipa("abhaacatba");
        String ans2 = skipApple("abhaappleacatb");
        System.out.println(ans2);
        
    }

    //by returning a string
    public static String skipa(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
            return skipa(str.substring(1));
        }else{
            return ch+ skipa(str.substring(1));
        }
    }
    
    // by passing ans as an argument
    public static void skipA(String str, String ans){
       if(str.isEmpty()){
        System.out.println(ans);
        return;
       }

       char ch = str.charAt(0);

       if(ch == 'a'){
        skipA(str.substring(1), ans);
       }else{
        skipA(str.substring(1), ans+ch);
       }

    }

    //skipping entire string
    public static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipApple(str.substring(4));
        }else{
            return ch + skipApple(str.substring(1));
        }
    }
}

