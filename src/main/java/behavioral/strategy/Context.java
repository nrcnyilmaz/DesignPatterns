package behavioral.strategy;

/**
 * @author Nurcan Yilmaz
 */
public class Context {

    IAttack attack;
    public void setChoice(IAttack attack)
    {
        this.attack = attack;
    }
    public void attack()
    {
        this.attack.attack();
    }
}
