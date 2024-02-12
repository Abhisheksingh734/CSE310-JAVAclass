package DSA.Recursion;

public class isSortedArray {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,6,6};

//        check if array is sorted
        boolean res = isSorted(arr,0);
        System.out.println(res);

    }


    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}
