package DSA.Recursion.sorting;

public class inPlaceMergeSort {
    public static void main(String[] args) {

    }

    static int[] mergeSort(int[] arr, int start, int end){
        if(arr.length ==1){
            return arr;
        }

        int mid = start + (end-start)/2;
        return new int[ merge(mergeSort(arr, 0, mid), mergeSort(arr,mid, end))];


    }


    static int merge(int[] first, int[] second){
        return 0;
        
    }




}
