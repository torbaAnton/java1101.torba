package torba.java1101.sololearn;

public class indexcheck {
    public static void main(String[] args) {
        String str1 = "page";
        String str2 = "ck";
        String str3 = "lo";
        int a = str1.length();
        int b = str2.length();
        int c = str3.length();
        String result = str1.substring(a-4, a-2)+str2.substring(b-2)+str3.substring(c)+str1.substring(a-3);
        System.out.println(result); }}
