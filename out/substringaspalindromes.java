package out;

public class substringaspalindromes {
    public static void solution(String s) {
        int i = 0;
        int j = s.length() - 1;
        while ( i < j ) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
            }
        }
  }
    public static void main(String[] args) {
        
        String str = "abcd";
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                System.out.println();;
            }
        }
    }
}
