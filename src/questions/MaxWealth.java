package questions;

//https://leetcode.com/problems/richest-customer-wealth/

//Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.
class MaxWealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            if((rowSum(accounts[i]))>max){
                max=rowSum(accounts[i]);
            }
        }
        return max;
    }

    public static int rowSum(int[] arr){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] accounts={
                {1,9,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
}