package Strings;

public class MostFrequentCharacter {
    public static char mostFreqChar(String s){
        if(s == null){
            return '\0';
        }
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        int maxFreq = 0;
        char result = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(maxFreq < freq[s.charAt(i)  - 'a']){
                maxFreq = freq[s.charAt(i) - 'a'];
                result = s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mostFreqChar("development"));
    }
}
