// User function Template for Java
class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        // Your code here
        String s = "";
        for (int i = 0; i < arr.size(); i++) {
            s = s.concat(arr.get(i));
        }
        return s;
    }
}