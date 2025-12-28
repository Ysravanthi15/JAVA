class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer>hs=new ArrayList<>();
        for(int x: arr){
            if(x<target){
                hs.add(x);
            }
        }
        return hs;
    }
}