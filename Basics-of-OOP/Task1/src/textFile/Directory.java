package textFile;

import java.util.HashMap;

public class Directory {
    // Имя директории
    private String name;

    // Файлы в директории
    private HashMap<String, File> files = new HashMap<>();

    // Конструктор с входными параметрами
    public Directory(String name) {
        this.name = name;
    }

    // Создать файл
    public File createFile(File file) {
        if (files.containsKey(file.getName())) {
            System.out.println("File already exist");
            return null;
        } else {
            files.put(file.getName(), file);
            return file;
        }
    }

    // Удалить файл
    public void delete(String name) {
        if (files.containsKey(name)) {
            files.remove(name);
            System.out.println("File deleted");
        } else {
            System.out.println("File does not exist");
        }
    }

    // Метод get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, File> getFiles() {
        return files;
    }

    public void setFiles(HashMap<String, File> files) {
        this.files = files;
    }
}
