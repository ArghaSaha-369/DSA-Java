package Array;

public class IsAnagram {
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            freq[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isAnagram("listen", "intels");
        System.out.println(result);
    }
}
