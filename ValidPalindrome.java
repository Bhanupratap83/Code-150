public class ValidPalindrome{
    public boolean isPalindrome(String s) {
        if(s == null) return true;


        String newStr = s.replaceAll("[^a-zA-Z0-9]", "");
        newStr = newStr.toLowerCase();
        int n = newStr.length();
        for(int i=0; i<n/2; i++){
            if(newStr.charAt(i) != newStr.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
}