package Day2;

public class IsRotation {
    public static boolean isRotation(String s1, String s2){
        if(s1 == null || s2 == null){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(0)){
                boolean match = true;
                for(int k=0; k<n; k++){
                    if(s1.charAt((i+k)%n) != s2.charAt(k)){
                        return false;

                    }
                }
                if(match){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab"));
    }
}
