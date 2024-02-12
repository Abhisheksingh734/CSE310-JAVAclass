package DSA.Recursion.strings;

import java.util.ArrayList;

/**
 * SubSeq
 */
public class SubSeq {

     public static void main(String[] args) {
        subseqAscii("", "abc");
      
        // System.out.println(subseqRet("", "abc"));
     }

     static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
      
        subseq(p+up.charAt(0), up.substring(1));
        subseq(p, up.substring(1));
     }

     static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p+(ch+0), up.substring(1));
     }

     // returning arrayList -creating left and right side arraylist
     static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> left =  subseqRet(p+up.charAt(0), up.substring(1));
        ArrayList<String> right =  subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
     }
}