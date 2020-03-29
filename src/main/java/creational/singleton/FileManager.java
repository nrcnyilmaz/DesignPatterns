package creational.singleton;

public class FileManager {
    private static FileManager instance;

    private FileManager() { }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public void createFile(String filePath, String fileName) {
        System.out.println(fileName + " created to " + filePath);
    }

    public void openFile(String file) {
        System.out.println(file + " is opened");
    }
}
