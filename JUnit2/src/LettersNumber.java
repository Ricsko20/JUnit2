public class LettersNumber {
    public int countLetter(String str) {
        if (str == null || str.length() < 2) {
            return 0;
        }

        char[] arr1 = str.toLowerCase().toCharArray();
        int count = 0;

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr1[i + 1]) {
                count++;
            }
        }

        return count;
    }
}
