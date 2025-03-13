import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Race race = new Race();
        byte numberCar = 1;
        Car car = new Car("", 0);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (car.name.isEmpty()) {
                System.out.println("— Введите название машины №" + numberCar + ": ");
                car.name = scanner.nextLine().trim();
                if (car.name.isEmpty()) {
                    System.out.println("— Неправильное название машины");
                    continue;
                }
            }

            System.out.println("— Введите скорость машины №" + numberCar + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("— Неправильная скорость");
                scanner.next();
                continue;
            }
            car.speed = scanner.nextInt();
            scanner.nextLine();
            if (car.speed < 0 || car.speed > 250) {
                System.out.println("— Неправильная скорость");
                continue;
            }
            race.findLeader(car);

            if (numberCar == 3) break;
            car = new Car("", 0);
            numberCar++;
        }

        System.out.println("Самая быстрая машина: " + race.leader);
        scanner.close();
    }
}
