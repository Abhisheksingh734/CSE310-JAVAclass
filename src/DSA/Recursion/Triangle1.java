package DSA.Recursion;

import java.util.Arrays;

public class Triangle1 {
    public static void main(String[] args) {
//        triangle(6,0);
//        triangle2(5,0);
        int arr[] = {4,3,2,1};
        bubble(arr,3,0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int row,int col){

        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            triangle(row,col+1);
        }else{
            System.out.println();
            triangle(row-1,0);
        }


    }

    static void triangle2(int row,int col){
        if(row==0){
            return;
        }

        if(col<row){
            triangle2(row,col+1);
            System.out.print("* ");
        }
        else{

            triangle2(row-1, 0);
            System.out.println();

        }
    }

    static void bubble(int[] arr,int row,int col){
        if(row == 0){
            return;
        }

        if(col<row) {
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr, row, col + 1);
        }else{
            bubble(arr, row-1, 0);
        }
    }

}

