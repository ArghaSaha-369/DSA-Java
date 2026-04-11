package Array;

public class ReverseString {
    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move pointers toward the middle
            left++;
            right--;
        }
        return new String(characters);
    }
    public static void main (String[] args){
        System.out.println(reverseString("Hello"));
    }
}
