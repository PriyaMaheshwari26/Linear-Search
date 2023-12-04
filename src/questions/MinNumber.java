package questions;

public class MinNumber {
    static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int element:arr){
            if(element<min) min=element;
        }
        return min;

    }
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int element:arr){
            if(element>max) max=element;
        }
        return max;

    }
    public static void main(String[] args) {

        int arr[]={12,89,76,54,36,87,90};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
}
