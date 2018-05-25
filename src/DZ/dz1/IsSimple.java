package DZ.dz1;

public class IsSimple {

        public static boolean isSimpler(int number) {
            boolean issimple = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    issimple = false;
                    break;
                }
            }
            return issimple;
        }

        public static void main(String[] args) {
            System.out.println(isSimpler(10001));
        }
    }