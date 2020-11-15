package behavioral.templatemethod;

/**
 * @author Nurcan Yilmaz
 */
public abstract class Engineering {

    public final void getClasses(){
        commonClasses();
        specialClasses();
    }

    protected abstract void specialClasses();

    protected final void commonClasses() {
        System.out.println("COMMON CLASSES: Math, Physics, Chemistry ");
    }
}
