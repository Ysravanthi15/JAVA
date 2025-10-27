class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length/2;
        int res=-1;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            hs.put(key,hs.getOrDefault(key,0)+1);
        }
        for(int s:hs.keySet()){
            int so=hs.get(s);
            if(so>n){
                return s;
            }
        }
        return -1;
        
    }
}