
import java.util.HashMap;

public class OOPSBannerApp {

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createHashMap();
        displayBanner("OOPS", map);
    }

    public static HashMap<Character, String[]> createHashMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
            "    **    ",
            "  **  **  ",
            "**      **",
            "**      **",
            "**      **",
            "  **   ** ",
            "    **    ",});
        charMap.put('P', new String[]{
            "********",
            "**    **",
            "**    **",
            "********",
            "**      ",
            "**      ",
            "**      ",});
        charMap.put('S', new String[]{
            "    ****",
            "  **    ",
            "**      ",
            " *****  ",
            "      **",
            "**   ** ",
            "  ****  ",});

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            for (char c : message.toCharArray()) {

                String[] pattern = charMap.get(c);
                System.out.print(pattern[line] + "  ");

            }

            System.out.println();
        }
    }
}
