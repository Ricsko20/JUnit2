import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String sz1, String sz2) {
        if(sz1.length() != sz2.length()) {
            return false;
        }

        char[] arr1 = sz1.toLowerCase().toCharArray();
        char[] arr2 = sz2.toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}
