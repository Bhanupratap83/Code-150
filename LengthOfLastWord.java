public class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        int n = words.length;
        String ans = words[n-1];
        int count = ans.length();
        return count;
    }
}