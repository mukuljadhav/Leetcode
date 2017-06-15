/*

119. Pascal's Triangle II

Description: Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
		List<Integer> rows = new ArrayList<Integer>();
		for (int i = 0; i <= rowIndex; i++) {
			rows.add(0, 1);
			for (int j = 1; j < rows.size() - 1; j++)
				rows.set(j, rows.get(j) + rows.get(j + 1));
			allRows.add(new ArrayList<>(rows));
		}
		return allRows.get(rowIndex);
    }
}

