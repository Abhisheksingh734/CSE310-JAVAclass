package DSA.Recursion.strings;

public class Permutations {
    public static void main(String[] args) {
        permute("", "abc");
    }

    static void permute(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        permute(p+ch, up.substring(1));
        permute(p, up.substring(1));
        

    }
    
    
}
