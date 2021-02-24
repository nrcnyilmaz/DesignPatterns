package structural.facade;

import java.io.File;

/**
 * @author Nurcan Yilmaz
 */
public class WordReader extends FileReader {
    public WordReader(File file) {
        super(file);
    }

    @Override
    public void read() {
        if(open()){
            // read file - do whatever you want :)
            System.out.println("Word is read.");
        }
    }
}
