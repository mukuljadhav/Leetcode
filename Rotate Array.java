/*

189. Rotate Array

Description: Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

*/

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length, j = 0;
        k = k % n;
	int[] result = new int[nums.length];
	for (int i = 0; i < n - k; i++)
		result[i + k] = nums[i];

	for (int i = n - k; i < n; i++)
		result[j++] = nums[i];

	for (int i = 0; i < result.length; i++)
		nums[i] = result[i];
		
    }
}
