package Day6;

public class HollowSquare {
        public static void hollowSquare(int n) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n-1) {
                    System.out.println("*".repeat(n));
                } else {
                    System.out.println("*" + " ".repeat(n-2) + "*");
                }
            }
        }
        public static void main(String[] args) {
            hollowSquare(5);
        }
    }


