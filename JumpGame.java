public class JumpGame{
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i <= farthest; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}