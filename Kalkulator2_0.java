
import java.util.Scanner;

public class Kalkulator2_0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1" + " = Dodawanie");
        System.out.println("2" + " = Odejmowanie");
        System.out.println("3" + " = Mnozenie");
        System.out.println("4" + " = Dzielenie");
        System.out.println("5" + " = Potegowanie");
        System.out.println("6" + " = Pierwiastek");
        System.out.println("7" + " = liczba pierwsza");
        System.out.println("8" + " = Liczba Armstronga");

        System.out.println("Wybierz operacje:");

        String wybierz = scanner.next();

        System.out.println("Wpisz liczbe");
        long liczba = scanner.nextLong();

        while (wybierz.equals("6")) {
            System.out.print("Wynik to: ");
            System.out.println(sqrt(liczba));
            System.out.close();
            scanner.close();
            break;
        }
        while (wybierz.equals("7")){

            long count=0;

            for (int i = 1; i <= liczba; i++) {
                if (liczba % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print( liczba + " to Liczba pierwsza");
            else
                System.out.print( liczba + " nie jest liczba pierwsza");

            System.out.close();
            scanner.close();
        }

        System.out.println("Wpisz liczbe1");

        long liczba1 = scanner.nextLong();





        System.out.print("Wynik to: ");

        if (wybierz.equals("1")) {
            System.out.println(add(liczba, liczba1));
        } else if (wybierz.equals("2")) {
            System.out.println(sub(liczba, liczba1));
        } else if (wybierz.equals("3")) {
            System.out.println(mul(liczba, liczba1));
        } else if (wybierz.equals("4")) {
            System.out.println(div(liczba, liczba1));
        } else if (wybierz.equals("5")) {
            System.out.println(pow(liczba, liczba1));
        }



    }

    public static long add(long liczba, long liczba1) {
        long wynik;
        wynik = liczba + liczba1;
        return wynik;
    }


    public static long sub(long liczba, long liczba1) {
        long wynik;
        wynik = liczba - liczba1;
        return wynik;
    }


    public static long mul(long liczba, long liczba1) {
        long wynik;
        wynik = liczba * liczba1;
        return wynik;
    }


    public static long div(long liczba, long liczba1) {
        long wynik;
        wynik = liczba / liczba1;
        return wynik;
    }


    public static double pow(long liczba, long liczba1) {
        double wynik;
        wynik = Math.pow(liczba, liczba1);
        return wynik;
    }


    public static double sqrt(long liczba) {
        double wynik;
        wynik = Math.sqrt(liczba);
        return wynik;
    }
}
