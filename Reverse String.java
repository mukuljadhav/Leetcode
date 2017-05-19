/*

344. Reverse String

Description:

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

*/

public class Solution {
    public String reverseString(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        char temp=0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
