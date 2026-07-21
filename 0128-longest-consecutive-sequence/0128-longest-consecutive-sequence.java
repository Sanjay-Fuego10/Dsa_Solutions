class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> list = new HashSet<>();
        for(int num:nums){
            list.add(num);
        }
        int maxsequence = 1;
        for(int num:list){
            if(!list.contains(num-1)){
                int current = num;
                int sequence = 1;
                while(list.contains(current+1)){
                    sequence++;
                    current++;
                }
                if(sequence > maxsequence){
                        maxsequence = sequence;
                    }
            }
        }
        return maxsequence;
    }
}