package DSA.Recursion.strings;

import java.util.ArrayList;

public class dice {
    
    public static void main(String[] args) {
        System.out.println(rolldicelist("", 4));
    }

    static void rolldice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target;i++){
            rolldice(p+i, target-i);
        }

    }
    static ArrayList<String> rolldicelist(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=target;i++){
            list.addAll((rolldicelist(p+i, target-i)));
        }

        return list;

    }


}
