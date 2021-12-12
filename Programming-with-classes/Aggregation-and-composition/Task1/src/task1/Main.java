package task1;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Java");
        Sentence sentence = new Sentence("Java is object oriented programming language!");
        Text text = new Text(word,sentence);
        text.printHeader();
        text.printText();
    }
}
