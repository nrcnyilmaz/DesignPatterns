package creational.factorymethod;

public class PopupWindowFactory {

    public PopupWindow getPopupWindow(EnumWindowType windowType) throws Exception {
        switch (windowType){
            case INFO:
                return new InfoPopupWindow();
            case ERROR:
                return new ErrorPopupWindow();
            case SUCCESS:
                return new SuccessPopupWindow();
            case WARNING:
                return new WarningPopupWindow();
            default:
                throw new Exception(windowType + " Window type can not be created");
        }
    }
}
