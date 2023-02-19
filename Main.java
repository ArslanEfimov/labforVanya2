import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите марку машины: ");
        String name = scan.nextLine();
        System.out.print("Введите цвет машины: ");
        String color = scan.nextLine();
        System.out.print("Введите предпочитаемый вес машины: ");
        Integer weight = scan.nextInt();
        System.out.print("Введите предпочитаемую скорость машины: ");
        Integer maxspeed = scan.nextInt();

        Cars.yourCar();
        Cars car = new Cars(name, color, weight, maxspeed);


    }

}