package creational.singleton;

public class FileManagerDoubleCheckedSingleton {
    private static FileManagerDoubleCheckedSingleton instance;

    private FileManagerDoubleCheckedSingleton() { }

    public static FileManagerDoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (FileManagerDoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new FileManagerDoubleCheckedSingleton();
                }
            }
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
