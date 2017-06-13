/*

462. Minimum Moves to Equal Array Elements II

Description: Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.

You may assume the array's length is at most 10,000.

Example:

Input:
[1,2,3]

Output:
2

Explanation:
Only two moves are needed (remember each move increments or decrements one element):

[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

*/

public class Solution {
    public int minMoves2(int[] nums) {
        int mid = 0, sum = 0;
		Arrays.sort(nums);
		mid = (nums.length % 2 == 0) ? (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2 : nums[nums.length / 2];
		for (int i = 0; i < nums.length; i++)
			sum += Math.abs(mid - nums[i]);
		return sum;
    }
}