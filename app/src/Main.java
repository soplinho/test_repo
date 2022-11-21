import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        while (true) {
            System.out.println("Podaj liczbę do liczenia pierwiastka");
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            System.out.println(Math.sqrt(liczba));
        }
    }
}