package structural.facade;


/**
 * @author Nurcan Yilmaz
 */
public class FacadeMainClass {

    public static void main(String[] args) {

        System.out.println(" *** FACADE DESIGN PATTERNT *** ");

        FileReaderFacade facade = new FileReaderFacade();

        String pdfName = "test.pdf";
        facade.readFile(pdfName);

        String excelName = "test.xls";
        facade.readFile(excelName);

    }
}
