import java.io.IOException;
import java.util.Scanner;
public class second {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.println("Попытайтесь её угадать!");

        ch = (char)System.in.read();

        if (ch == answer) {
            System.out.println("Поздравляю! Это правильный ответ!");
        }  else if (ch > answer) {
            System.out.println("Перестарался!");
        }  else {
            System.out.println("Недостарался");
        }

    }
}