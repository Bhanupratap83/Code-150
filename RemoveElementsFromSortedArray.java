// 26. Remove Duplicates from Sorted Array

public class RemoveElementsFromSortedArray{
    public int removeDuplicates(int[] nums) {
        int i=0;

        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }
}