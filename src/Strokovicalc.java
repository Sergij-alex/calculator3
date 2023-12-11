import java.util.Scanner;

public class Strokovicalc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите выражение:[\"a\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x] где a и b - строки а x - число  от 1 до 10 включительно  + Enter" );
            String viragenie = scanner.nextLine();

                Schet shet = new Schet();

            try {
                String result = shet.vichislitViragenie(viragenie);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

    }


