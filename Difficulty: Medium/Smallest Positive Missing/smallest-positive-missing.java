class Solution {
    public int missingNumber(int[] arr) {
        // code here
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                map.add(arr[i]);
            }
        }
        if (map.size() == 0) return 1;
        Collections.sort(map);
        int expected = 1;

        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == expected) {
                expected++;
            } else if (map.get(i) > expected) {
                return expected;
            }
        }

        return expected;
        
        
    }
}
