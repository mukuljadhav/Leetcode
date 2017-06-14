/*

118. Pascal's Triangle

Description: Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
	    List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			Integer in;
			if (i == 1) {
				list.add(1);
			}
			for (int j = 0; i > 1 && j < mainList.get(i - 1).size() - 1; j++) {
				if (j == 0)
					list.add(1);
				in = mainList.get(i - 1).get(j) + mainList.get(i - 1).get(j + 1);
				list.add(in);
			}
			list.add(1);
			mainList.add(list);
			list = new ArrayList<>();
		}
		
		return mainList;
    }
}