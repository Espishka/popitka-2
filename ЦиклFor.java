import java.util.Scanner;
public class ЦиклFor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);
    }
}
