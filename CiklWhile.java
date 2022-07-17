/*Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно,
 а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
 Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.*/
import java.util.Scanner;
public class CiklWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min =  2147483647;
        int min2 =  2147483647;
        while (sc.hasNextInt()) {     //выполняем цикл, пока не введут что-то отличное от цифр
            int a = sc.nextInt();
            if (a < min){          //если вдруг введенное меньше минимального значения
                min2 = min;        //то приравниваем второе минимальное к первому
                min=a;             //а первое приравниваем к введенному значению
            }
                                   //если введенное меньше второго минимального и при этом
                                   //не равно первому минимальному
            else if (  a < min2 && a != min ) {
                min2 = a;          // то приравниваем второе минимальное к введенному
            }
        }
        System.out.print(min2);
    }
}
