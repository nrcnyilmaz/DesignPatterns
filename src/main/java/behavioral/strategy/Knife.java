package behavioral.strategy;

/**
 * @author Nurcan Yilmaz
 */
public class Knife implements IAttack {

    private EnumWeapon weapon;

    public Knife() {
        this.weapon = EnumWeapon.KNIFE;
    }

    @Override
    public void attack() {
        //do something
        System.out.println("Enemy is killed by using " + weapon.name());
    }
}
