/*Intuition
Hold 1 pointer to 1 element and use another pointer to traverse all elements by checking its sum to target and then increase 1st pointer if the pairs are not found and return empty array if no pairs are found.

Approach
Brute-Force method

Complexity
Time complexity: O(n^2)
Space complexity: O(1)
Code*/
package Two_pointers;
import java.util.Scanner;
public class twosum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target = 10;
        int[] nums = new int[5];
        System.out.println("Enter the array element:");
        for (int i=0;i<5;i++){
            nums[i]=sc.nextInt();
        }
        Solution sol = new Solution();
        int[] arr = sol.twoSum(nums,target);
        System.out.println("The array of indices pointing the pairs with target 10: ["+ arr[0]+","+arr[1]+"]");
        sc.close();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]+ nums[j]==target)
                return new int[]{i,j};
            j++;
            if(j==(nums.length)){// why not j==nums.length-1. to check last element j=2 and nl=3th then it resets before even checking.
                i++;
                j=i+1;
            }   
               
        }
        return new int[]{};
    }
}
