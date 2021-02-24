package structural.facade;


import java.io.File;

/**
 * @author Nurcan Yilmaz
 */
public abstract class FileReader {
    private File file;

    FileReader(File file) {
        this.file = file;
    }

    private boolean canRead() {
        //do something
        return true;
    }

    protected boolean open() {
        if (canRead()) {
            System.out.println(file.getName() + " is readable.");
            return true;
        } else {
            System.out.println(file.getName() + " is unreadable.");
            return false;
        }
    }

    public abstract void read();
}
