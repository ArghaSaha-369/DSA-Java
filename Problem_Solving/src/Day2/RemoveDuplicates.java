package Day2;

public class RemoveDuplicates {
    public static String removeDuplicates(String s){
        if (s == null || s.length() == 0){
            return "";
        }
        int[] freq = new int[256];
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (freq[s.charAt(i)] == 0){
                result.append(s.charAt(i));
                freq[s.charAt(i)]++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("Heeeyyyy"));
    }
}
