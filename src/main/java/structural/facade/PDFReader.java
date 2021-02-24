package structural.facade;

import java.io.File;

/**
 * @author Nurcan Yilmaz
 */
public class PDFReader extends FileReader {

    public PDFReader(File file) {
        super(file);
    }

    @Override
    public void read() {
        if(open()){
            // read file - do whatever you want :)
            System.out.println("PDF is read.");
        }

    }
}
