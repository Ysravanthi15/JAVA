class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        for(int i=min;i<=max;i++){
            boolean found = false;
            for (int x : nums) {
                if (x == i) 
                {
                    found = true;
                    break;
                }
            }
            if(!found){
                arr.add(i);
            }

        }
        return arr;  
    }
}