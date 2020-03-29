package creational.singleton;

public enum FileManagerEnumSingleton {
    INSTANCE;

    public void createFile(String filePath, String fileName) {
        System.out.println(fileName + " created to " + filePath);
    }

    public void openFile(String file) {
        System.out.println(file + " is opened");
    }

}
