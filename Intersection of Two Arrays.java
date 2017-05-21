/*

349. Intersection of Two Arrays

Description: Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:

Each element in the result must be unique.

The result can be in any order.

*/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[]{};
		Set<Integer> set = new HashSet<>();
        int j=0;
        for(int n : nums1)
            set.add(n);
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                nums2[j++] = nums2[i];
                set.remove(new Integer(nums2[i]));
            }
        }
        int[] result = new int[j];
        System.arraycopy( nums2, 0, result, 0, j );
        return result;
    }
}
