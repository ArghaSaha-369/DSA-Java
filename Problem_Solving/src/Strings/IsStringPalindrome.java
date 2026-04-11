package Strings;

public class IsStringPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) == ' '){
                left++;
                continue;
            }
            if(s.charAt(right) == ' '){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main() {
        System.out.println(isPalindrome("oppo"));
    }
}
