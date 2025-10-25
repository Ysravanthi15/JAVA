// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        Arrays.sort(arr);
        LinkedHashMap<String,Integer>hs=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            String key=arr[i];
            hs.put(key,hs.getOrDefault(key,0)+1);
        }
        String bestkey=null;
        int maxvalue=Integer.MIN_VALUE;
        for(String keys:hs.keySet()){
            int value=hs.get(keys);
            if(value>maxvalue || (value == maxvalue && keys.compareTo(bestkey)<0)){
                maxvalue = value;
                bestkey=keys;
            }
        }
        return bestkey;
    }
}