
public class RISUNOK {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;                //Вычисляем, сколько в строке должно быть звездочек.
            for (int j = 0; j < starCount; j++)    //Цикл по звездочкам
                System.out.print("*");             //(выводим starCount звездочек).
            System.out.println();                  //Добавляем перенос курсора на следующую строку, чтобы строки не слиплись
        }
    }
}
