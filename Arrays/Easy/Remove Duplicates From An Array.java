class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ll=new ArrayList<>();
        if (nums.length == 0) return 0;

        ll.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
               
                ll.add(nums[i]);
            }
        }
        
       return  ll.size();
    }
}
