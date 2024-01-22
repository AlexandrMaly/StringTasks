package Tasks;

import java.util.Scanner;

public class StringTaskThree {
    private static String taskThree = "Bob, Alice, Tom, Lucy, Bob, Lisa";
    private static int count;
    private static String searchName;
    private static Scanner sc = new Scanner(System.in);



    public static void startTaskTwo() {
        System.out.println("________Task three________");
        searchName = searchName().replaceAll("[^a-zA-Z0-9]", "");
        count = countNames(taskThree, searchName);
        printWords(searchName,count);
    }

    private static String searchName() {
        System.out.println("Please input the name");
        String searchName = sc.nextLine();
        sc.close();
        return searchName;
    }

    private static int countNames(String names, String searchName) {
        String[] nameArray = names.split(", ");
        int count = 0;
        for (String name : nameArray) {
            if (name.equalsIgnoreCase(searchName)) {
                count++;
            }
        }
        return count;
    }

    private static void printWords(String searchName, int count) {
        if (count > 0) {
            System.out.println("Name " + searchName + " found in the sentence " + count + " times");
        } else {
            System.out.println("Name " + searchName + " not found in the sentence");
        }
    }

}
