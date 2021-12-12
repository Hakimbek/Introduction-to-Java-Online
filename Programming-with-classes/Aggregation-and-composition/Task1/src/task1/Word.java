package task1;

public class Word {
    // Слово
    private String word;

    // Конструктор с входными параметрами
    public Word(String word) {
        this.word = word;
    }

    // Default constructor
    public Word() {
    }

    // Методы get- и set-
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    // Print
    public void print() {
        System.out.println(word);
    }
}
