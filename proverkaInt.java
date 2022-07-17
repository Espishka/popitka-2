import java.util.Scanner;
//будем считывать данные, пока это будет тип Int. Цикл while..
public class proverkaInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //сумма чисел, которые введет юзер до момента последней введенной
        while (sc.hasNextInt()) {   //проверка на тип Int
        int a = sc.nextInt();
        sum = sum + a;
        }
        System.out.print(sum); //тут выводим сумму введеных польхователем чисел
    }
}
