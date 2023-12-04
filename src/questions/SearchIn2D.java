package questions;

import java.util.Arrays;

public class SearchIn2D {
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j} ;
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] minMax(int[][] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };
        System.out.println(Arrays.toString(search(arr,70)));
        System.out.println(Arrays.toString(minMax(arr)));

    }
}
