package the.sum.simple;

public class Question_2315 {
    // 这道题有一个陷阱，本题的解题思路是，利用split分割字符串
    // 当‘|’在字首的时候，统计奇数位字符串中的*
    // 当”|“不在字首的时候，统计偶数位字符串中的*
    // 但是，在使用split分割字符串的时候，如果使用的分隔字符正好在字符串的第一位，
    // 那么字符串会把第一个位置分隔成空字符 列如：|**|*|*| -> "","**","*","*"
    // 这就导致，当”|“在字首的时候，我们使用(i % 2) != 0) 实际上是统计了偶数位的字符串
    // 修改成(i % 2) == 0) 才是统计奇数位的字符串
    public static int countAsterisks(String s) {
        String[] split = s.split("\\|");
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            if ((s.charAt(0) == '|' && ((i % 2) == 0)) || (s.charAt(0) != '|' && ((i % 2) == 0))) {
                sum += split[i].length() - split[i].replaceAll("\\*", "").length();
            }
        }
        return sum;
    }



    // 官方思路
    public static int countAsterisks2(String s){
        boolean tmp = true;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') tmp = !tmp;
            if (tmp && s.charAt(i) == '*') sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countAsterisks2("|**|*|*|**||***||"));
    }
}
