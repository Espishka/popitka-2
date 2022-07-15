import java.util.Scanner;
import java.util.Arrays;
public class Doobee {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
         int [] ArrayDays = new int [99];

        System.out.print("Введите число: ");
        int n = sc.nextInt();
        if (n==5) {
            System.out.print(5*5);
        } else
            System.out.print((n/10)*((n/10)+1) + "25");




    }
}
