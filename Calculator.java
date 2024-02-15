package Kalkulator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnozenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Potegowanie");
            System.out.println("6 - Pierwiastkowanie");
            System.out.println("0 - Exit");

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Wybierz operacje");
            String wybor = sc.nextLine();

            if (wybor.equals("0")) {
                sc.close();
                break;
            }

            System.out.println("Podaj liczbe");
            int liczba = sc.nextInt();

            if (!wybor.equals("6")) {
                System.out.println("Podaj druga liczbe");
                int liczba2 = sc.nextInt();


                switch (wybor) {
                    case "1" -> System.out.println("Wynik to: " + add(liczba, liczba2));
                    case "2" -> System.out.println("Wynik to: " + sub(liczba, liczba2));
                    case "3" -> System.out.println("Wynik to: " + mul(liczba, liczba2));
                    case "4" -> System.out.println("Wynik to: " + div(liczba, liczba2));
                    case "5" -> System.out.println("Wynik to: " + pow(liczba, liczba2));
                }
            } else {
                System.out.println("Wynik to: " + sqrt(liczba));
            }
        }

    }

    public static int add(int liczba, int liczba2){
        return liczba + liczba2;
    }

    public static int sub(int liczba, int liczba2){
        return liczba - liczba2;
    }

    public static int mul(int liczba, int liczba2){
        return liczba * liczba2;
    }

    public static double div(double liczba, double liczba2){
        return liczba / liczba2;
    }

    public static double pow(int liczba, int liczba2){
        return Math.pow(liczba, liczba2);
    }

    public static double sqrt(double liczba){
        return Math.sqrt(liczba);
    }
}
