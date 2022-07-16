import java.math.BigInteger;
import java.util.Scanner;
//Алгоритм для факториала.
public class Main {
    public static BigInteger getFactorial(int f ) {
        BigInteger result = BigInteger.ONE; // BigInteger - для больших чисел. (.ONE - константа)
        for (int i = 1; i <= f; i++)  // С помощью цикла for вычисляем факториал числа.
            result = result.multiply(BigInteger.valueOf(i));   // Multiply(x) — операция умножения this * x;
        return result;
    }
     public static void main(String[] args) {
        System.out.print(getFactorial(5));
    }

}