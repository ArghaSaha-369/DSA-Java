package Day2;

public class LongestSubstring {
    public static int longestSubstring(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        int maxLen=0;
        int[] freq = new int[256];
        for(int i=0; i<s.length(); i++){
            int currentLen = 0;
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(freq[ch] == 1){
                    break;
                }
                freq[ch] = 1;
                currentLen++;
            }
            if(currentLen>maxLen){
                maxLen=currentLen;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("Javaprogramming"));
    }
}
