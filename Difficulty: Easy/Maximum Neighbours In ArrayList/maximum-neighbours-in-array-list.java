// User function Template for Java
class Solution {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here;
        ArrayList<Integer> res =new ArrayList<>();
        int Max=0;
        int prev=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(prev<=arr.get(i)){
                Max=arr.get(i);
                res.add(Max);
                prev=Max;
            }
            else{
                res.add(prev);
                prev=arr.get(i);
            }
        }
        return res;
    }
}