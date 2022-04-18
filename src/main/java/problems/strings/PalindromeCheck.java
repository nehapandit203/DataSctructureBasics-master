package problems.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "tin";
        boolean isPalindrome = palindromeString(s);
        System.out.println(isPalindrome);
    }

    private static boolean palindromeString(String s) {
        String reversestr= "";

        for (int j = s.length()-1; j >= 0; j--) {
            reversestr = reversestr+s.charAt(j);

        }
        if(reversestr.equalsIgnoreCase(s))
            return true;

        return false;
    }
}
