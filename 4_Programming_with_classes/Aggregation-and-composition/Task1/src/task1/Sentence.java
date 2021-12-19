package task1;

public class Sentence {
    // Предложение
    private String sentence;

    // Конструктор с входными параметрами
    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    // Default constructor
    public Sentence() {
    }

    // Методы get- и set-
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    // Print
    public void print() {
        System.out.println(sentence);
    }
}
