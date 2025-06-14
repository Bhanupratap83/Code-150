// 189. Rotate Array
import java.util.*;
public class RotateArray{
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k %= n;
        Queue<Integer> q = new LinkedList<>();

        for(int num : nums){
            q.add(num);
        }

        for(int i=0; i<n-k; i++){
            q.add(q.remove());
        }

        for(int i=0; i<n; i++){
            nums[i] = q.remove();
        }
    }

    //OR 

    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     reverse(nums, 0, n-1);
    //     reverse(nums, 0, k-1);
    //     reverse(nums, k, n-1);
    // }
    // public void reverse(int nums[], int si, int ei){
    //     while(si < ei){
    //         int temp = nums[si];
    //         nums[si] = nums[ei];
    //         nums[ei] = temp;
    //         si++;
    //         ei--;
    //     }
    // }
}