package textFile;

public abstract class File {
    // Имя
    private String name;

    // Содержимое
    private String content;

    // Тип файла
    private String suffix;

    // Конструктор с входными параметрами
    public File(String name, String content, String suffix) {
        this.name = name;
        this.content = content;
        this.suffix = suffix;
    }

    // Изменить имя
    public void changeName(String name) {
        setName(name);
    }

    // Дополнить
    public void addContent(String text) {
        content = content + " " + text;
    }

    // Вывести на консоль
    public void print() {
        System.out.println(content);
    }

    // Методы get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
