/*

278. First Bad Version

Description : You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        Solution s = new Solution();
        if(n == 1) return 1;
        int low = 1;
		int high = n;
		int mid = 0;
        int ans = 0;
		while (low <= high) {
			mid = low + ((high - low) / 2);     // Also can use (low + high) >>> 1 to avoid overflow
			if (s.isBadVersion(mid)){
			    ans = mid ;
				high = mid - 1;
			}
			else
				low = mid + 1;
		}
		
		return ans;
    }
}