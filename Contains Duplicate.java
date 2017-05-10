/*

217. Contains Duplicate

Description: Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.

*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
       int count = 0;
		Map<Integer,Integer> mapp = new HashMap<>();
		for(int i : nums){
			if(mapp.containsKey(i))
			    return true;
			else
				mapp.put(i, count+1);
		}
		return false;
    }
}