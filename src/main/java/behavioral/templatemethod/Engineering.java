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

    private void commonClasses() {
        System.out.print("Math, Physics, Chemistry, ");

    }
}
