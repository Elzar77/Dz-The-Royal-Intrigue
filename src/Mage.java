public class Mage extends Character {

    public Mage(String name, int loyalty, int power) {
        super(name, loyalty, power);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " использует крысинные заклинание!");
    }

    public void castProtectiveSpell() {
        setLoyalty(getLoyalty() + 5);
        System.out.println(getName() + " увеличил скуллы. Новая способность: " + getLoyalty());
    }
}