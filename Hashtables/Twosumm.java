package Hashtables;


import java.util.HashMap;
import java.util.Scanner;

public class Twosumm{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        int[] nums = new int[5];
        System.out.println("Enter the elements in  array: ");
        for (int i =0; i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution(); 
        int[] result = sol.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found with the given target.");
        }

    }

static class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmp= new HashMap<>();
        for( int i=0;i<=nums.length-1;i++){
            int n = target-nums[i];
            if (hmp.containsKey(n)){
                return new int[]{i, hmp.get(n)};
            }
            hmp.put(nums[i] , i);
            
        }
        return new int[]{};
    }
}

}

// Solution is outside the main static class if not make solution as
    



