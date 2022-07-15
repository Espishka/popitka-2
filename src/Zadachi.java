import java.util.Scanner;
public class Zadachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите заработную плату 3-х сотрудников: ");
        int salary1 = sc.nextInt();
        int salary2 = sc.nextInt();
        int salary3 = sc.nextInt();
        if ( salary1 >= 100000 || salary3 >= 100000 || salary2 >= 100000 )
            System.out.println("Вы ввели слишком большое число для одной или более зарплат");
        else if (salary1 > salary2 && salary1>salary3 && salary2 < salary3 )
            System.out.print(salary1 - salary2);

        else if (salary1 > salary2 && salary1>salary3 && salary3 < salary2 )
            System.out.print(salary1 - salary3);

        else if (salary2 > salary1 && salary2>salary3 && salary1 < salary3 )
            System.out.print(salary2 - salary1);

        else if (salary2 > salary1 && salary2>salary3 && salary3 < salary1 )
            System.out.print(salary2 - salary3);

        else if (salary3 > salary2 && salary3>salary1 && salary2 < salary1 )
            System.out.print(salary3 - salary2);

        else if (salary3 > salary2 && salary3>salary1 && salary1 < salary2 )
            System.out.print(salary3 - salary1);
    }
}