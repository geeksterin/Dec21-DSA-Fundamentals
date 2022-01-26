import java.util.*;

public class GoatLatin {
    static public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        int r = 1;
        for (String word : words) {
            char ch = word.charAt(0);
            if (vowels.contains(ch))
                sb.append(word).append("ma").append("a".repeat(r++)).append(" ");
            else
                sb.append(word.substring(1, word.length())).append(word.charAt(0)).append("ma").append("a".repeat(r++))
                        .append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I am a goat"));
    }
}