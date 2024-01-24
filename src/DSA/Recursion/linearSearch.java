package DSA.Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,18,9};

        int res = search(arr, 0, 9);
        System.out.println(res);

        searchAll(arr,0,2);
        System.out.println(list);
    }

    public static int search(int[] arr, int index, int target){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return search(arr,index+1, target);


    }

    static ArrayList< Integer> list = new ArrayList<>();
     static void searchAll(int[] arr, int index, int target){

        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
         searchAll(arr,index+1, target);




    }


}
