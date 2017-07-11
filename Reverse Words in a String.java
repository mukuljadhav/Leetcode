/*

151. Reverse Words in a String

Description: Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

*/

public class Solution {
    public String reverseWords(String s) {
        if(s.matches("^\\s*$")) return "";
        String[] arr = s.trim().split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            if(!arr[i].equals(""))
                sb.append(arr[i] + " ");
        }
        return String.valueOf(sb.toString().trim());
    }
}