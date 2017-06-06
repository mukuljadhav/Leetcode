/*

506. Relative Ranks

Description: Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.

*/

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, String> map = new HashMap<Integer, String>();
		int[] result = new int[nums.length];
		int[] intermArr = new int[nums.length];
		int m = 0;
		String[] finalArr = new String[nums.length];

		for (int i = 0; i < nums.length; i++)
			result[i] = nums[i];

		Arrays.sort(result);

		for (int i = result.length - 1; i >= 0; i--)
			intermArr[m++] = result[i];

		if (intermArr.length >= 3) {
			map.put(intermArr[0], "Gold Medal");
			map.put(intermArr[1], "Silver Medal");
			map.put(intermArr[2], "Bronze Medal");
		}
		else if(intermArr.length == 2) {
			map.put(intermArr[0], "Gold Medal");
			map.put(intermArr[1], "Silver Medal");
		}
		else if(intermArr.length == 1) {
			map.put(intermArr[0], "Gold Medal");
		}

		for (int i = 3; i < intermArr.length; i++) {
			map.put(intermArr[i], Integer.toString(i + 1));
		}

		for (int i = 0; i < nums.length; i++) {
			finalArr[i] = map.get(nums[i]);
		}
		return finalArr;
    }
}