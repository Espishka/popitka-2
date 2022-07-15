public class Beers {
public static void main(String [] args) {
    int beerNum = 99;
    String word = "Бутылок";
    while (beerNum > 0) {
        if (beerNum%10 ==  1) {
            word = "Бутылка";
        }
        else if (beerNum%10 == 2 || beerNum%10 == 3 || beerNum%10 == 4) {
            word = "Бутылки";
        }
        System.out.println(beerNum + " " + word + " Пива на стене");
        System.out.println(beerNum + " " + word + " пива.");
        System.out.println("Возьми одну");
        System.out.println("Пусти по кругу");
        beerNum = beerNum-1;
        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + " Пива на стене");
        }
        else {
            System.out.println( " Нет бутылок пива на стене");
        }
    }
}
}
