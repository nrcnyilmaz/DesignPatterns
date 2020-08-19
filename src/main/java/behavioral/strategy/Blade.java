package behavioral.strategy;

/**
 * @author Nurcan Yilmaz
 */
public class Blade implements IAttack {
    private EnumWeapon weapon;

    public Blade() {
        this.weapon = EnumWeapon.BLADE;
    }

    @Override
    public void attack() {
        //do something
        System.out.println("Enemy is killed by using " + weapon.name());
    }
}
