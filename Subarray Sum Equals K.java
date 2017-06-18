/*

560. Subarray Sum Equals K

Description : Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2

*/

public class Solution {
    public int subarraySum(int[] nums, int k) {
        /*int size = nums.length;
		int mySum = 0, count = 0;
		for (int i = 0; i < size; i++) {
			mySum = 0;
			mySum += nums[i];
			if(mySum == k)
				count++;
			for (int j = i + 1; j < size; j++) {
				mySum += nums[j];
				if (mySum == k) {
					count++;
				}
			}
		}
		return count;*/
		
		int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}