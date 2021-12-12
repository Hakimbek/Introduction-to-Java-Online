package task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */
public class Text {
    // Заголовок
    private Word header;

    // Текст
    private Sentence text;

    // Конструктор с входными параметрами
    public Text(Word header, Sentence text) {
        this.header = header;
        this.text = text;
    }

    // Default constructor
    public Text() {
    }

    // Дополнить текст
    public void addText(String sentence) {
        text.setSentence(text.getSentence() + " " + sentence);
    }

    // Print header
    public void printHeader() {
        header.print();
    }

    // Print text
    public void printText() {
        text.print();
    }

    // Методы get- и set-
    public Word getHeader() {
        return header;
    }

    public void setHeader(Word header) {
        this.header = header;
    }

    public Sentence getText() {
        return text;
    }

    public void setText(Sentence text) {
        this.text = text;
    }
}
