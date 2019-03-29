package torba.java1101.sololearn;

public class testing {
    public static void main(String[] args) {
        String s = "Программирование на Java";

        if(s.length() > 0) {
            reverseString(s, s.length() - 1);
        }
    }

    public static void reverseString(String s, int i) {
        if(i == 0) {
            System.out.println(s.charAt(i));

            return;
        }

        System.out.print(s.charAt(i));

        reverseString(s, i - 1);
    }
    }