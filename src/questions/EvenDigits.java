package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDigits {
    static int count(int num){
        int count=0;
        while (num>0){
            num/=10;
            count++;
        }
        return count;
    }
    static int count2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static boolean isEven(int num){
        return count(num)%2==0;
    }
    static int[] countDigits(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(count(arr[i]));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    static int[] even(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if(isEven(arr[i])){
               list.add(arr[i]);
           }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(count(4572345));
        System.out.println(count2(4572345));
        System.out.println(isEven(40572345));
        int[] arr={10,280,79,76,54};
        System.out.println(Arrays.toString(even(arr)));
        System.out.println(Arrays.toString(countDigits(arr)));
    }
}
