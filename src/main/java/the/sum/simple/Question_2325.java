package the.sum.simple;

import sun.java2d.pipe.SpanIterator;

import java.util.HashMap;

public class Question_2325 {
    public static String decodeMessage(String key, String message){
        HashMap<Character, Character> stringCharacterHashMap = new HashMap<>();
        int tmp = 0;
        String count = "";
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char)(i+97);
        }
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') continue;
            if (!stringCharacterHashMap.containsKey(key.charAt(i))){
                stringCharacterHashMap.put(key.charAt(i),chars[tmp]);
                tmp++;
            }
        }
        for (int i = 0; i < message.length(); i++) {
            Character character;
            if (message.charAt(i) == ' ') {
                character = ' ';
            }else {
                character = stringCharacterHashMap.get(message.charAt(i));
            }
            count += character;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));

    }
}
