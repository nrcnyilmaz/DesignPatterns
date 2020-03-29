package creational.singleton;

public class SingletonMainClass {
    public static void main(String[] args) {
        System.out.println(" ** SINGLETON DESIGN PATTERN DEMO ** ");

        System.out.println("\n -- Classic Singleton Example -- ");
        FileManager.getInstance().createFile("C:\\", "newFile.txt");
        FileManager.getInstance().openFile("C:\\newFile.txt");

        System.out.println("\n -- Enum Singleton Example -- ");
        FileManagerEnumSingleton.INSTANCE.createFile("C:\\", "newFile.txt");
        FileManagerEnumSingleton.INSTANCE.openFile("C:\\newFile.txt");

        System.out.println("\n -- Bill Pugh Singleton Example -- ");
        FileManagerBillPughSingleton.getInstance().createFile("C:\\", "newFile.txt");
        FileManagerBillPughSingleton.getInstance().openFile("C:\\newFile.txt");

        System.out.println("\n -- Double Checked Singleton Example -- ");
        FileManagerDoubleCheckedSingleton.getInstance().createFile("C:\\", "newFile.txt");
        FileManagerDoubleCheckedSingleton.getInstance().openFile("C:\\newFile.txt");

    }
}
