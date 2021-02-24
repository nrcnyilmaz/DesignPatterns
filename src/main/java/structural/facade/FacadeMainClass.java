package structural.facade;


/**
 * @author Nurcan Yilmaz
 */
public class FacadeMainClass {

    public static void main(String[] args) {
        FileReaderFacade facade = new FileReaderFacade();

        String pdfName = "test.pdf";
        facade.readFile(pdfName);

        String excelName = "test.xls";
        facade.readFile(excelName);

    }
}
