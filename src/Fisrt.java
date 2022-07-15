import java.util.Scanner;
public class Fisrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int a = 0;
          int c = 10;

        int random_number1 = 0 + (int) (Math.random() * 10);


        System.out.println("Загадано чило от 1 до 10, попробуйте угадать его: ");

        int b = sc.nextInt();
        System.out.println(b);
        while (b != random_number1) {
              if (b > 10) {
                System.out.println("Число не входит в данный диапазон))");
            }
              else {
                  System.out.println("Попробуйте ещё разок)");
              }
            b = sc.nextInt();
        }
        System.out.println("Верно! Поздравляю!");
    }
}
