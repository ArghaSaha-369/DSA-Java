package Array;

public class IsRotation {
    public static boolean isRotation(int[] arr1, int[] arr2){
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        int n = arr1.length;
        if(n==0){
            return true;
        }
        for (int i=0; i<n; i++){
            if(arr1[i] == arr2[0]){
                boolean match = true;
                for(int k=0; k<n; k++){
                    if(arr1[(i+k)%n] != arr2[k]){
                        match = false;
                        break;
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
        int[] arr1={2, 3, 4, 5};
        int[] arr2={4, 5, 2, 3};
        System.out.println(isRotation(arr1, arr2));
    }
}
