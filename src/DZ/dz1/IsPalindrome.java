package DZ.dz1;

public class IsPalindrome {


    public static boolean isPalindrome(Long multiplication) {

        String s = multiplication.toString();
        int lengthStr = s.length();
        for (int i = 0; i <= lengthStr; i += 2) {
            if (s.charAt(i) != s.charAt( (lengthStr - i - 1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome((long)(999949999)));
    }
}
