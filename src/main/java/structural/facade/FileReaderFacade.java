package structural.facade;

import java.io.File;
import java.util.Arrays;

/**
 * @author Nurcan Yilmaz
 */
public class FileReaderFacade {

    public void readFile(String fileName) {

        String type = Arrays.stream(fileName.split("\\.")).reduce((a, b) -> b).orElse(null);
        FileReader fileReader = null;
        switch (type) {
            case "doc":
                fileReader = new WordReader(new File(fileName));
                break;
            case "pdf":
                fileReader = new PDFReader(new File(fileName));
                break;
            default:
                System.out.println(fileName + " can not read in this system.");
                break;
        }

        if (fileReader != null) {
            fileReader.read();
        }
    }

}
