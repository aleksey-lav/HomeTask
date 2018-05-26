package DZ.dz1;

public class IsPalindrom {


    public static boolean isPalindromeNUmber(Long multiplication) {

         String s = multiplication.toString();
        int lengthStr = s.length();
        for (int i = 0; i < lengthStr; i++) {
            if (s.charAt(i) != s.charAt( (lengthStr - i - 1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNUmber((long)(999949999)));
    }
}
