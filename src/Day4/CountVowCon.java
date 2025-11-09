package Day4;

public class CountVowCon {
        public static void main(String[] args) {
            String str = "pathfinders";  // Example string
            int vowels = 0, consonants = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char)(ch + 32);
                    }
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        vowels++;
                    else
                        consonants++;
                }
            }

            System.out.println("String: " + str);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }


