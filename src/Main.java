// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
     static int search(int[] arr,int target) {
         if (arr.length == 0) return -1;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==target){
//                return i;
//            }
//        }
         //will return the element if found else -1
         //but there can be an issue of returning the element here
         //let suppose target is -1, then there can be confusion
         //for that we can return Integer.MAX_VALUE;
         for (int element : arr) {
             if (element == target) {
                return element;
            }
             }
             return -1;

     }

    public static void main(String[] args) {
       int arr[]={12,89,76,54,36,-87,90};
       int target=-87;
        System.out.println(search(arr,target));

    }
}