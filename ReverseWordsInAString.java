public class ReverseWordsInAString{
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            String temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = temp;
        }
        return String.join(" ", arr);
    }
}