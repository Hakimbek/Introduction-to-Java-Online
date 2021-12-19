package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка, содержащая следующий текст (xml - документ):
 * <notes>
 *    <note id = "1">
 *        <to>Вася</to>
 *        <from>Света</from>
 *        <heading>Напоминание</heading>
 *        <body>Позвони мне завтра!</body>
 *    </note>
 *    <note id = "2">
 *        <to>Петя</to>
 *        <from>Маша</from>
 *        <heading>Важное напоминание</heading>
 *        <body/>
 *    </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содеожимое узлов xml - документа и его
 * тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоватся готовыми парсерами
 * XML для решения данной задачи нельзя.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "<notes>\n"
                + "   <note id = \"1\">\n"
                + "       <to>Вася</to>\n"
                + "       <from>Света</from>\n"
                + "       <heading>Напоминание</heading>\n"
                + "       <body>Позвони мне завтра!</body>\n"
                + "   </note>\n"
                + "   <note id = \"2\">\n"
                + "       <to>Петя</to>\n"
                + "       <from>Маша</from>\n"
                + "       <heading>Важное напоминание</heading>\n"
                + "       <body/>\n"
                + "   </note>\n"
                + "</notes>";

        parse(text);
    }

    public static void parse(String text) {
        String[] splittingText = text.split("\n\\s*");
        for (String row : splittingText) {
            Matcher openTag = Pattern.compile("<\\w.+?>").matcher(row);
            Matcher emptyTag = Pattern.compile("<\\w.+?/>").matcher(row);
            Matcher closeTag = Pattern.compile("</\\w+>").matcher(row);
            Matcher tagBody = Pattern.compile(">.+?<").matcher(row);

            if (openTag.find()) {
                System.out.println(openTag.group() + " - open tag");
            } else if (emptyTag.find()) {
                System.out.println(emptyTag.group() + " - empty tag");
            }

            if (tagBody.find()) {
                System.out.println(tagBody.group().substring(1, tagBody.group().length() - 1) + " - tag body");
            }

            if (closeTag.find()) {
                System.out.println(closeTag.group() + " - close tag");
            }
        }
    }
}
