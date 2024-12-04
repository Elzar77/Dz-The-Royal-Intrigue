public class Knight extends Character {

      public Knight(String name, int loyalty, int power) {
            super(name, loyalty, power);
      }

      @Override
      public void performAction() {
            System.out.println(getName() + " Делает сигму!");
      }

      public void defendKing() {
            setPower(getPower() + 10);
            System.out.println(getName() + " Мьюнинг. Новый метод сигмы: " + getPower()+ "+10 Aура");
      }
}