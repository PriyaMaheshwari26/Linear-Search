package questions;

//TC: Best Case- O(1) & Worst Case- O(N)

public class SearchInString {
    public  static int search(String str,char target){
        if(str.length()==0) return -1;

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public  static Character search2(String str,char target){
        if(str.isEmpty()) return null;

        for (char ch:str.toCharArray()) {
            if(ch==target){
                return ch;
            }
        }
        return null;
    }
    public  static boolean search3(String str,String target) {
        if (str.isEmpty()) return false;
        return str.contains(target);

    }



    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(search(str,'o'));
        System.out.println(search2(str,'o'));

    }
}
