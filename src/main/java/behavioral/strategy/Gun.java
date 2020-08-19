package behavioral.strategy;

/**
 * @author Nurcan Yilmaz
 */
public class Gun implements IAttack {

    private EnumWeapon weapon;

    public Gun() {
        this.weapon = EnumWeapon.GUN;
    }

    @Override
    public void attack() {
        //do something
        System.out.println("Enemy is killed by using " + weapon.name());

    }
}
