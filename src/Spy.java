public class Spy extends Character {

    public Spy(String name, int loyalty, int power) {
        super(name, loyalty, power);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " хочет закрысить...");
    }

    public void spreadRumors(Character task) {
        task.setLoyalty(task.getLoyalty() - 5);
        System.out.println(getName() + " уменьшил лояльность " + task.getName() + ". Лояльность теперь: " + task.getLoyalty());
    }

    public void checkBetrayal() {
        if (getLoyalty() < 20) {
            System.out.println(getName() + " крысит короля! - 1000 Аура");
        }
    }
}