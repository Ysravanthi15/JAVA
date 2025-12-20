class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer>hs=new ArrayList<>();
        int maxRight=arr[n-1];
        hs.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                hs.add(arr[i]);
                maxRight=arr[i];
            }
             
        }
        Collections.reverse(hs);
        return hs;
    }
}
