package the.sum.simple;

import sun.java2d.pipe.SpanIterator;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Question_2325 {
    public static String decodeMessage(String key, String message){
        HashMap<Character, Character> stringCharacterHashMap = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!stringCharacterHashMap.containsKey(key.charAt(i)) && key.charAt(i) != ' '){
                stringCharacterHashMap.put(key.charAt(i),c);
                c++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                stringBuilder.append(' ');
            }else {
                stringBuilder.append(stringCharacterHashMap.get(message.charAt(i)));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
        System.out.println("...");
    }
}
