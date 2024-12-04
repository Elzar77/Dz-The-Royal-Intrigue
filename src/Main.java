import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character selectedCharacter = null;
        System.out.println("Придумайте пароль до 5 чисел");
        String pasword = scanner.nextLine();
        System.out.println("Придумайте никнейм");
        String nik = scanner.nextLine();
        System.out.println("Добро пажаловать! Вы успешно зарегистрированы!");

        while (true) {
            System.out.println("Королевская интрига");
            System.out.println("1. Выбрать персонажа");
            System.out.println("2. Выполнить действие");
            System.out.println("3. Выйти из игры");
            System.out.print("Введите номер действия: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выберите персонажа:");
                    System.out.println("1. Рыцарь");
                    System.out.println("2. Маг");
                    System.out.println("3. Шпион");
                    System.out.print("Ваш выбор: ");

                    int Choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (Choice) {
                        case 1:
                            selectedCharacter = new Knight("Сигма", 50, 30);
                            System.out.println("Вы выбрали рыцаря: " + selectedCharacter.getName());
                            break;
                        case 2:
                            selectedCharacter = new Mage("Пикмидробер", 40, 20);
                            System.out.println("Вы выбрали мага: " + selectedCharacter.getName());
                            break;
                        case 3:
                            selectedCharacter = new Spy("Танос", 25, 15);
                            System.out.println("Вы выбрали шпиона: " + selectedCharacter.getName());
                            break;
                        default:
                            System.out.println("Ошибка! Попробуйте снова.");
                            break;
                    }
                    break;

                case 2:
                    if (selectedCharacter == null) {
                        System.out.println("Сначала выберите персонажа!");
                    } else {
                        System.out.println("Выполняется действие персонажа:");
                        selectedCharacter.performAction();
                    }
                    break;

                case 3:
                    System.out.println("Вы вышли из игры");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}