package Day1;

public class StrRevStatic {
    public static void main(String[] args) {
        String og="StringReverse";
        StringBuilder sb = new StringBuilder(og);
        System.out.println("the reversed string is " + sb.reverse());
    }
}
