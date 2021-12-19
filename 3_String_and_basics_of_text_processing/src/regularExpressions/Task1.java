package regularExpressions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполняет с текстом
 * три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении
 * отсортировать слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства - по алфавиту.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "My name is Hakimbek Bahramov. I am 22 years old.\n" +
                "\tI am student. I study in UrSU. I study in economy faculty. I like coding!\n" +
                "\tDo you like read books?\n" +
                "\tI am developer. I live in Urgench";

        System.out.println("Введите 1 для отсортировки обзацов по количеству предложений");
        System.out.println("Введите 2 для отсортировки слов по длине");
        System.out.println("Введите 3 для отсортировки лексем в предложении");
        System.out.println("Введите 0 для выхода");
        System.out.println("------------------------------------------------------------");

        int num = 1;
        while (num == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите: ");
            int enteredNum = scanner.nextInt();

            if (enteredNum == 1) {
                String[] strings = sortParagraph(text);
                for (String string : strings) {
                    System.out.println(string);
                }
            } else if (enteredNum == 2) {
                String[] strings = sortWords(text);
                for (String string : strings) {
                    System.out.println(string);
                }
            } else if (enteredNum == 3) {
                String[] strings = sortLetter(text, 'a');
                for (String string : strings) {
                    System.out.println(string);
                }
            } else if (enteredNum == 0) {
                num = 0;
            }
        }
    }

    public static String[] sortParagraph(String text) {
        String[] array = text.split("\\R\\t");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].split("[.!?]").length > array[j + 1].split("[.!?]").length) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static String[] sortWords(String text) {
        String[] array = text.split("\\R\\t");
        for (int k = 0; k < array.length; k++) {
            String[] split = array[k].split("[.!?]");
            for (int i = 0; i < split.length; i++) {
                String[] whiteSpace = split[i].trim().split("\\s");
                for (int j = 0; j < whiteSpace.length; j++) {
                    for (int l = 0; l < whiteSpace.length - j - 1; l++) {
                        if (whiteSpace[l].length() > whiteSpace[l + 1].length()) {
                            String temp = whiteSpace[l];
                            whiteSpace[l] = whiteSpace[l + 1];
                            whiteSpace[l + 1] = temp;
                        }
                    }
                }
             split[i] = Arrays.toString(whiteSpace);
            }
            array[k] = Arrays.toString(split);
        }
        return array;
    }


    public static String[] sortLetter(String text, char letter) {
        String[] split = text.split("\\R\\t");
        for (int i = 0; i < split.length; i++) {
            String[] sentence = split[i].split("[.!?]");
            for (int j = 0; j < sentence.length; j++) {
                String[] word = sentence[j].trim().split("\\s");
                for (int w = 0; w < word.length; w++) {
                    for (int l = 0; l < word.length - w - 1; l++) {
                        int prev = 0;
                        int next = 0;

                        for (int k = 0; k < word[l].length(); k++) {
                                if (word[l].charAt(k) == letter) {
                                    prev++;
                                }
                        }

                        for (int k = 0; k < word[l + 1].length(); k++) {
                            if (word[l + 1].charAt(k) == letter) {
                                next++;
                            }
                        }

                        if (prev < next) {
                            String temp = word[l];
                            word[l] = word[l + 1];
                            word[l + 1] = temp;
                        }

                        if (prev == next) {
                            int bool = word[l].compareTo(word[l + 1]);
                            if (bool < 0) {
                                String temp = word[l];
                                word[l] = word[l + 1];
                                word[l + 1] = temp;
                            }
                        }

                    }
                }
                sentence[j] = Arrays.toString(word);
            }
            split[i] = Arrays.toString(sentence);
        }
        return split;
    }
}
