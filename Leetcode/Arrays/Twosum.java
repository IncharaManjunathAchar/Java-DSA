import java.util.HashMap;
import java.util.Map;

class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        
       
        Map<Integer, Integer> numToIndex = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
                      
            if (numToIndex.containsKey(difference)) {
               return new int[] {numToIndex.get(difference), i};
            }
            numToIndex.put(num, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
//Output = Indices: [0, 1]