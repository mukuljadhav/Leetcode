/*

350. Intersection of Two Arrays II

Description: Given two arrays, write a function to compute their intersection.

Example:

Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

*/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> listNums1 = new ArrayList<>();
		List<Integer> listIntersection = new ArrayList<>();
		for (int n : nums1)
			listNums1.add(n);
		for (int n : nums2) {
			if (listNums1.contains(n)) {
				listIntersection.add(n);
				listNums1.remove(new Integer(n));
			}
		}
		int[] result = new int[listIntersection.size()];

		for (int i = 0; i < listIntersection.size(); i++)
			result[i] = listIntersection.get(i);
		
		return result;
    }
}