package behavioral.templatemethod;

/**
 * @author Nurcan Yilmaz
 */
public class TemplateMethodMainClass {

    public static void main(String[] args) {
        System.out.println(" ** TEMPLATE METHOD DESIGN PATTERN DEMO ** ");
        Engineering computerEngineering = new ComputerEngineering();
        computerEngineering.getClasses();

        Engineering electricalEngineering = new ElectricalEngineering();
        electricalEngineering.getClasses();

        //electricalEngineering.commonClasses();

    }
}
