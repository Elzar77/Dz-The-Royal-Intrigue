public class Character {
    private String name;
    private int loyalty;
    private int power;

    public Character(String name, int loyalty, int power) {
        this.name = name;
        this.loyalty = loyalty;
        this.power = power;
    }

    public void performAction() {
        System.out.println(name + " выполняет своё задание.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}