package DSA.Recursion;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 0,arr.length-1,4));
    }

    static int search(int[] arr,int s,int e,int target){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return search(arr, s, mid-1,target);
            }else{
                return search(arr, mid+1, e,target);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return search(arr,mid+1,e,target);
        }
            return search(arr,s,mid-1,target);

    }
}
