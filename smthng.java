import java.util.Scanner;
public class smthng {
    public static void main(String[] args) {
        int[] massive;  //не указываем количество элементов в массиве
        int n;          //чтобы это сделал пользвоатель
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        n = sc.nextInt(); //получаем кол-во элементов
        massive = new int [n]; //выделяем память с данным кол-вом элементов
        for (int i = 0; i < n; i++) {
            System.out.print("Введите данные для massive[" +i+ "] = ");
            massive [i] = sc.nextInt();  //вводим данные для каждой ячейки
        }
    }
}