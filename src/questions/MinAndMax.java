package questions;

import java.util.Arrays;

public class MinAndMax {
    static int[] minMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int element:
             arr) {
            if(element<min) min=element;
            if(element>max) max=element;
        }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        int arr[]={12,89,76,54,36,87,90};
        System.out.println(Arrays.toString(minMax(arr)));
    }
}
