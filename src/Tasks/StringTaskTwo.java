package Tasks;

public class StringTaskTwo {
    private static String taskTwo = "orange, plum, tomato, onion, grape, onion";
    private static int onionCount = 0;

    public static void startTaskTwo() {
        System.out.println("________Task two________");
        printWords(deleteWord(splitWords(taskTwo)));
    }

    private static String [] splitWords(String taskOne) {
        String[] arrayWord = taskOne.split(", ");
        for (String words : arrayWord) {
            if (words.equals("onion")) {
                onionCount++;
            }
        }
        return arrayWord;
    }

    private static String [] deleteWord(String [] word) {
        String [] stringWithOutOnion = new String[word.length - onionCount];
        int index = 0;
        for (String words : word) {
            if (!words.equals("onion")) {
                stringWithOutOnion[index++] = words;
            }
        }
        return stringWithOutOnion;
    }


    private static void printWords(String[] correctWords) {
        for (int i = 0; i < correctWords.length; i++) {
            System.out.print((i + 1) + ") " + correctWords[i] + "\n");
        }
    }

}
