package creational.singleton;

public class FileManagerBillPughSingleton {

    private FileManagerBillPughSingleton() { }

    public static FileManagerBillPughSingleton getInstance() {
        return SingletonInnerClass.instance;
    }

    private static class SingletonInnerClass {
        private static final FileManagerBillPughSingleton instance = new FileManagerBillPughSingleton();
    }

    public void createFile(String filePath, String fileName) {
        System.out.println(fileName + " created to " + filePath);
    }

    public void openFile(String file) {
        System.out.println(file + " is opened");
    }

}
