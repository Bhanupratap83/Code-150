// 169. Majority Element

public class MajorityElement{
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> count = new HashMap<>();

        // int n = nums.length;
        // int majorityEle = n/2;

        // for(int num: nums){
        //     count.put(num, count.getOrDefault(num, 0) + 1);

        //     if(count.get(num) > majorityEle){
        //         return num;
        //     }

        // }
        // return -1;


        int n = nums.length;
        int majorityEle = n/2;

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }

                if(cnt > majorityEle){
                    return nums[i];
                }
            }
        }

        return -1;
    }
}