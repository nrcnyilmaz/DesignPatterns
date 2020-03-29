package creational.factorymethod;

public class FactoryMethodMainClass {
    // GOF Defination: Define an interface for creating an object, but let subclasses decide which class to instantiate.
    //The factory methos lest a class defer instantiation to subclassess.
    public static void main(String[] args) throws Exception {

        System.out.println(" ** FACTORY METHOD DESIGN PATTERN DEMO **");

        PopupWindow warningPopupWindow = new PopupWindowFactory().getPopupWindow(EnumWindowType.WARNING) ;
        warningPopupWindow.show();

        PopupWindow successPopupWindow = new PopupWindowFactory().getPopupWindow(EnumWindowType.SUCCESS) ;
        successPopupWindow.show();

        PopupWindow errorPopupWindow = new PopupWindowFactory().getPopupWindow(EnumWindowType.ERROR) ;
        errorPopupWindow.show();

        PopupWindow infoPopupWindow = new PopupWindowFactory().getPopupWindow(EnumWindowType.INFO) ;
        infoPopupWindow.show();

    }
}
