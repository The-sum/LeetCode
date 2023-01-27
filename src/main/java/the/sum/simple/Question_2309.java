package the.sum.simple;

import jdk.nashorn.internal.ir.IfNode;

import java.net.SocketTimeoutException;
import java.util.HashSet;

public class Question_2309 {

    // 我写的，一坨大便
    public static String greatestLetter(String s) {
        HashSet<String> strings = new HashSet<>();
        String tmp = " ";
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);

            // 当前字符是小写
            if ((Character.isLowerCase(str.charAt(0)) && strings.contains(str.toUpperCase())) || (Character.isUpperCase(str.charAt(0)) && strings.contains(str.toLowerCase()))) {
                if (tmp.toUpperCase().charAt(0) < str.toUpperCase().charAt(0)) {
                    tmp = str;
                }
            } else {
                strings.add(str);
            }
        }
        if (tmp.equals(" ")) {
            return "";
        } else return tmp.toUpperCase();
    }

    //官方的，优雅
    private static String greatestLetter2(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        for (int i = 25; i >= 0; i--) {
            char tmp = (char) ('A' + i);
            if (characters.contains(tmp) && characters.contains((char) (tmp + 32))){
                return String.valueOf(tmp);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(greatestLetter2("AbCdEfGhIjK"));
    }
}
