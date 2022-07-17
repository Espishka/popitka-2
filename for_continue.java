import java.util.Scanner;    //Программа для вывода ссумы чисел от start до end
public class for_continue {  // при этом кратных multiple. С помощью цикла for
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;

        for (; start < end; start++) {     //пока старт меньше энда - выполняем цикл
            if (start % multiple != 0) continue;   //если старт не кратен мультиплай, то пропускаем
            sum = start + sum;      //подсчет суммы

        }

        System.out.println(sum);
    }
}
