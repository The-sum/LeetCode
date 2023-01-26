package the.sum.medium;

import sun.print.SunMinMaxPage;

import java.lang.reflect.Array;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;


public class Question_1663 {
    // 1663. 具有给定数值的最小字符串
    // n:长度   k:数值
    // 贪心算法
    // 假定字符串各个位置都为a，从后往前遍历数组，设置求出数值差d，如果d不小于25直接将最后一位设置为z，如果d小于25
    // 则将当前位置的字符加上d
    public static String getSmallestString(int n, int k) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        int d = k - n;
        for (int i = n - 1; i >= 0; i--) {
            if (d >= 25) {
                chars[i] = 'z';
                d -= 25;
            } else if (d > 0) {
                chars[i] = (char) ('a' + d);
                break;
            }
        }
        return String.valueOf(chars);
    }


    // 网友的优化方案
    public static String getSmallestString2(int n, int k) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        int d = k - n, i = n - 1;
        for (; d >= 25; d -= 25) {
            chars[i--] = 'z';
        }
        chars[i] = (char)('a' + d);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestString(5, 73));
        System.out.println("优化："+getSmallestString2(5,73));
    }
}
