import java.util.Scanner;
/*
Стакан наполовину пуст или наполовину полон?
*/
public class BooleanZadacha {
        public static void main(String[] args) {
            double glass = 0.5;
            int a;
            Scanner sc = new Scanner(System.in);
            boolean b = sc.nextBoolean();
            if (b == true) {                              //если boolean = true, то стакан полон (=1)
                System.out.print(a = (int)Math.ceil(glass));
            }
            else
                System.out.print(a = (int)Math.floor(glass));
        }
    }

