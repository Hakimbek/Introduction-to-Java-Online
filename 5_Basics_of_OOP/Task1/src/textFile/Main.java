package textFile;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("src");
        File test = directory.createFile(new TextFile("test"));
        File text = directory.createFile(new TextFile("text"));
        File myFile = directory.createFile(new TextFile("myFile"));

        test.addContent("Hello World");
        test.print();
        test.addContent("Java");
        test.print();

        File mySecondFile = directory.createFile(new TextFile("myFile"));
        directory.delete("text");
    }
}
