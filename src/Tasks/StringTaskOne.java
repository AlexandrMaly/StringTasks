package Tasks;

public class StringTaskOne {
    private static String taskOne = "brange, plum, tomato, onibn, grape";

    public static void startTaskOne() {
        System.out.println("________Task one________");
        printWords(splitWords(taskOne));
    }

    private static String[] splitWords(String taskOne) {
        String[] word = taskOne.split(", ");
        for (int i = 0; i < word.length; i++) {
            word[i] = correctWord(word[i]);
        }
        return word;
    }

    private static String correctWord(String word) {
        word = word.replace("brange", "orange");
        word = word.replace("onibn", "onion");
        return word;
    }

    private static void printWords(String[] correctWords) {
        for (int i = 0; i < correctWords.length; i++) {
            System.out.print((i + 1) + ") " + correctWords[i] + "\n");
        }
    }

}
