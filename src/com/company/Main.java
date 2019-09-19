package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//////////Wypisywanie danych na ekran

        // 1.
        //Wprowadź swoje imię do zmiennej typu String. Wypisz na konsolę „Witaj, <imię>”
        //wykorzystując funkcję println


//        String imie;
//        imie = "Mateusz";
//        System.out.println("Witaj, " + imie);

        //2.
        //Wypisz dwa dowolne łańcuchy znaków jeden pod drugim z wykorzystaniem funkcji print

//        String pierwszyLancuch;
//        String drugiLancuch;
//
//        pierwszyLancuch = "Jeden chciałby być żołnieżem";
//        drugiLancuch = "Drugi chiałby być papieżem...";
//
//        System.out.print(pierwszyLancuch + "\n" + drugiLancuch);

        //3.
        //Wprowadź dowolną wartość z kilkoma cyframi po przecinku do zmiennej typu double .
        //Wyświetl podaną wartość z dokładnością do dwóch miejsc po przecinku.

//        double liczba;
//        liczba = 05.061990;
//        System.out.printf("%.2f", liczba);

        //4.
        //4.*Wyświetl trzy dowolne ciągi znaków w jednej linii tak, aby były wyrównane do prawej
        //krawędzi 15 znakowych bloków. Np. „ test t wprowadzenie”.

//        String pierwszyCiag;
//        String drugiCiag;
//        String trzeciCiag;
//        String spacja;
//
//        pierwszyCiag = "oj ";
//        drugiCiag = "tam ";
//        trzeciCiag = "oj tam";
//        spacja = " ";
//
//      // można tak
//        int sumaZnakow;
//        int liczbaSpacji;
//        sumaZnakow = pierwszyCiag.length() + drugiCiag.length() + trzeciCiag.length();
//        liczbaSpacji = 15 - sumaZnakow;
//
//        System.out.println(spacja.repeat(liczbaSpacji) + pierwszyCiag + drugiCiag + trzeciCiag);
//
//      // albo po prostu tak... ;p (duże "S" wypisuje wielkimi literami)
//
//        String sumaCiagow = pierwszyCiag + drugiCiag + trzeciCiag;
//        System.out.printf("%1$15s", sumaCiagow);

        //5.
        //5.**Wyświetl wartości 192, 168, 1, 10 heksadecymalnie w formacie XX:XX:XX:XX, dla
        //podanych wartości powinniśmy otrzymać: „C0:A8:01:0A”

//        int pierwszLiczba;
//        int drugaLiczba;
//        int trzeciaLiczba;
//        int czwartaLiczba;
//
//        pierwszLiczba = 192;
//        drugaLiczba = 168;
//        trzeciaLiczba = 1;
//        czwartaLiczba = 10;
//
//        String hexpierwszLiczba = String.format("%1$02X",pierwszLiczba);
//        String hexdrugaLiczba = String.format("%1$02X",drugaLiczba);
//        String hextrzeciaLiczba = String.format("%1$02X",trzeciaLiczba);
//        String hexczwartaLiczba = String.format("%1$02X",czwartaLiczba);
//
////        String pierwszyHex = Integer.toHexString(pierwszLiczba).toUpperCase();
////        String drugiHex = Integer.toHexString(drugaLiczba).toUpperCase();
////        String trzeciHex = Integer.toHexString(trzeciaLiczba).toUpperCase();
////        String czwartyHex = Integer.toHexString(czwartaLiczba).toUpperCase();
////    // ^ ucina początkowe zera... ??
////
////        System.out.println(pierwszyHex + ":" + drugiHex + ":" + trzeciHex + ":" + czwartyHex);
////    // ^ ucina początkowe zera... ??
//
//        System.out.println(hexpierwszLiczba + ":" + hexdrugaLiczba + ":" + hextrzeciaLiczba + ":" + hexczwartaLiczba);


//////////Czytanie danych z ekranu

        //1.
        //Wprowadź swoje imię z poziomu konsoli i zapisz je do zmiennej typu String. Wypisz na
        //konsolę „Witaj, <imię>”.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imię:");
//        String imie = scanner.nextLine();
//        System.out.println("Witaj, " + imie);

        //2.
        //Wprowadź z poziomu konsoli dwie wartości, dodaj je do siebie i wypisz ich sumę.

//        Scanner scanner = new Scanner(System.in);
//        double pierwszaWartosc;
//        double drugaWartosc;
//        double suma;
//
//        System.out.println("Podaj pierwszą liczbę:");
//        pierwszaWartosc = scanner.nextDouble();
//        System.out.println("Podaj drugą liczbę:");
//        drugaWartosc = scanner.nextDouble();
//        suma = pierwszaWartosc + drugaWartosc;
//        System.out.println("Suma podanych wartości to: " + suma);

//////////Instrukcje warunkowe - if-else

        //1.
        //Zmodyfikuj przykładowy program tak, aby pobierana liczba pochodziła z konsoli.
        //        Przetestuj program dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
        //Podpowiedź: skorzystaj z metody Scannera nextInt


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę: ");
//        int naszaLiczba;
//        naszaLiczba = scanner.nextInt();
//        if (naszaLiczba< 10){
//            System.out.println("Nasza liczba jest mniejsza od 10");
//        } else if (naszaLiczba == 10) {
//            System.out.println("Nasza liczba jest równa 10");
//        } else {
//            System.out.println("Nasza liczba jest większa od 10");
//        }

        //2.
        //Pobierz z konsoli wartość od 0 do 9. Na podstawie otrzymanej wartości wyświetl dowolny
        //znak. Na przykład dla numeru 0 wyświetl „*”, dla 1 wyświetl „$” (lub dowolny inny).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfrę: ");
//        int naszaLiczba = scanner.nextInt();
//
//        if (naszaLiczba == 1) {
//            System.out.println("!");
//        } else if (naszaLiczba == 2) {
//            System.out.println("@");
//        } else if (naszaLiczba == 3) {
//            System.out.println("#");
//        } else if (naszaLiczba == 4) {
//            System.out.println("$");
//        } else if (naszaLiczba == 5) {
//            System.out.println("%");
//        } else if (naszaLiczba == 6) {
//            System.out.println("^");
//        } else if (naszaLiczba == 7) {
//            System.out.println("&");
//        } else if (naszaLiczba == 8) {
//            System.out.println("*");
//        } else if (naszaLiczba == 9) {
//            System.out.println("(");
//        } else if (naszaLiczba == 0) {
//            System.out.println(")");
//        } else {
//            System.out.println("To nie jest cyfra...");
//        }

        //3.
        //3.*Jak wyżej, ale zamiast wartości operuj na łańcuchach znaków (Stringach). Na przykład
        //dla słowa „gwiazdka” wyświetl „*”.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj nazwę znaku od 1 do 0: ");
//        String naszeSlowo = scanner.nextLine();
//
//        if (naszeSlowo.equals("wykrzyknik")) {
//            System.out.println("!");
//        } else if (naszeSlowo.equals("malpa")) {
//            System.out.println("@");
//        } else if (naszeSlowo.equals("hash")) {
//            System.out.println("#");
//        } else if (naszeSlowo.equals("dolar")) {
//            System.out.println("$");
//        } else if (naszeSlowo.equals("procent")) {
//            System.out.println("%");
//        } else if (naszeSlowo.equals("daszek") ^ naszeSlowo.equals("kareta")) {
//            System.out.println("^");
//        } else if (naszeSlowo.equals("and" ) ^ naszeSlowo.equals("et")) {
//            System.out.println("&");
//        } else if (naszeSlowo.equals("gwiazdka")) {
//            System.out.println("*");
//        } else if (naszeSlowo.equals("nawias otwarty")) {
//            System.out.println("(");
//        } else if (naszeSlowo.equals("nawias zamkniety")) {
//            System.out.println(")");
//        } else {
//            System.out.println("(_!_)");
//        }

//////////Instrukcje warunkowe switch-case

        //1.
        //Zmodyfikuj przykładowy program tak, aby pobierana liczba pochodziła z konsoli.
        //Przetestuj program dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
        //Podpowiedź: skorzystaj z metody Scannera nextInt

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę: ");
//        int naszaLiczba = scanner.nextInt();
//
//        switch (naszaLiczba){
//            case 10:
//                System.out.println("nasza liczba jest równa 10");
//                break;
//            case 100:
//                System.out.println("nasza liczba jest równa 100");
//                break;
//            default:
//                System.out.println("nasza liczba jest różna od 10 i 100");
//                break;
//        }

        //2.
        //Pobierz z konsoli wartość od 0 do 9. Na podstawie otrzymanej wartości wyświetl dowolny
        //znak. Na przykład dla numeru 0 wyświetl „*”, dla 1 wyświetl „$” (lub dowolny inny).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfrę: ");
//        int naszaLiczba = scanner.nextInt();
//
//        switch (naszaLiczba) {
//            case 1:
//                System.out.println("!");
//                break;
//            case 2:
//                System.out.println("@");
//                break;
//            case 3:
//                System.out.println("#");
//                break;
//            case 4:
//                System.out.println("$");
//                break;
//            case 5:
//                System.out.println("%");
//                break;
//            case 6:
//                System.out.println("^");
//                break;
//            case 7:
//                System.out.println("&");
//                break;
//            case 8:
//                System.out.println("*");
//                break;
//            case 9:
//                System.out.println("(");
//                break;
//            case 0:
//                System.out.println(")");
//                break;
//            default:
//                System.out.println("To nie jest cyfra...");
//                break;
//
//        }

        //3.
        //Jak wyżej, ale zamiast wartości operuj na łańcuchach znaków (Stringach). Na przykład dla
        //słowa „gwiazdka” wyświetl „*”.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfrę: ");
//        String naszaLiczba = scanner.nextLine();
//
//        switch (naszaLiczba) {
//            case "wykrzyknik":
//                System.out.println("!");
//                break;
//            case "malpa":
//                System.out.println("@");
//                break;
//            case "hash":
//                System.out.println("#");
//                break;
//            case "dolar":
//                System.out.println("$");
//                break;
//            case "procent":
//                System.out.println("%");
//                break;
//            case "daszek":
//            case "kareta":
//                System.out.println("^");
//                break;
//            case "et":
//            case "and":
//                System.out.println("&");
//                break;
//            case "gwiazdka":
//                System.out.println("*");
//                break;
//            case "nawias otwarty":
//                System.out.println("(");
//                break;
//            case "nawias zamkniety":
//                System.out.println(")");
//                break;
//            default:
//                System.out.println("(.)(.)");
//                break;
//
//        }

        //4.
        //4.*Jak wyżej, ale po wyświetleniu danego znaku wyświetl wszystkie kolejne możliwości
        //(jeśli posiadamy case „gwiazdka”, a kolejny to „dolar” to po wpisaniu gwiazdki
        //powinniśmy otrzymać zarówno gwiazdkę, jak i dolar).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfrę: ");
//        String naszaLiczba = scanner.nextLine();
//
//        switch (naszaLiczba) {
//            case "wykrzyknik":
//                System.out.println("!");
//            case "malpa":
//                System.out.println("@");
//            case "hash":
//                System.out.println("#");
//            case "dolar":
//                System.out.println("$");
//            case "procent":
//                System.out.println("%");
//            case "daszek":
//            case "kareta":
//                System.out.println("^");
//            case "et":
//            case "and":
//                System.out.println("&");
//            case "gwiazdka":
//                System.out.println("*");
//            case "nawias otwarty":
//                System.out.println("(");
//            case "nawias zamkniety":
//                System.out.println(")");
//            default:
//                System.out.println("(.)(.)");
//                break;
//        }

//////////ZADANIA - POWTÓRKA

        //1.
        //Napisz prosty kalkulator, który:
        //a) Przyjmuje dwie wartości x i y, zwraca ich sumę oraz różnicę. Wykorzystaj funkcję
        //printf albo String.format tak, aby znak „=„ i „+” oraz „ „-” były w tym samym miejscu
        //jeden pod drugim. Nie używaj metody nextInt()

//        Scanner scanner = new Scanner(System.in);
//        double x;
//        double y;
//        double suma;
//        double roznica;
//
//        x = scanner.nextDouble();
//        y = scanner.nextDouble();
//        suma = x + y;
//        roznica = x - y;
//        System.out.printf("Suma:    %1$-12.12s %2$s %3$-12.12s %4$s %5$s %n", x, "+", y, "=", suma);
//        System.out.printf("Różnica: %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x, "-", y, "=", roznica);


        //b)j/w + podawanie informacji, czy chcemy, aby dokonać dodawania, czy
        //odejmowania poprzez napisanie „suma” lub „różnica”. Wykorzystaj instrukcję
        //warunkową-if else

//        Scanner scanner = new Scanner(System.in);
//        double suma;
//        double roznica;
//
//        System.out.println("Suma czy różnica?");
//        String dzialanie = scanner.nextLine();
//
//        if (dzialanie.equals("suma")) {
//            double x1 = scanner.nextDouble();
//            double y1 = scanner.nextDouble();
//            suma = x1 + y1;
//            System.out.printf("Suma:    %1$-12.12s %2$s %3$-12.12s %4$s %5$s %n", x1, "+", y1, "=", suma);
//        } else if (dzialanie.equals("różnica")) {
//            double x2 = scanner.nextDouble();
//            double y2 = scanner.nextDouble();
//            roznica = x2 - y2;
//            System.out.printf("Różnica: %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x2, "-", y2, "=", roznica);
//        } else {
//            System.out.println("błędny wybór");
//        }

        //c)*j/w + użytkownik może zdecydować jaką operację chce wykonać uwzględniając
        //mnożenie i dzielenie. Wykorzystaj instrukcję warunkową switch-case

//        Scanner scanner = new Scanner(System.in);
//        double suma;
//        double roznica;
//        double mnozenie;
//        double dzielenie;
//
//        System.out.println("Suma, różnica, mnożenie czy dzielenie?");
//        String dzialanie = scanner.nextLine();
//
//        switch (dzialanie) {
//            case "suma":
//                double x1 = scanner.nextDouble();
//                double y1 = scanner.nextDouble();
//                suma = x1 + y1;
//                System.out.printf("Suma:      %1$-12.12s %2$s %3$-12.12s %4$s %5$s %n", x1, "+", y1, "=", suma);
//                break;
//            case "różnica":
//                double x2 = scanner.nextDouble();
//                double y2 = scanner.nextDouble();
//                roznica = x2 - y2;
//                System.out.printf("Różnica:   %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x2, "-", y2, "=", roznica);
//                break;
//            case "mnożenie":
//                double x3 = scanner.nextDouble();
//                double y3 = scanner.nextDouble();
//                mnozenie = x3 * y3;
//                System.out.printf("Mnożenie:  %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x3, "*", y3, "=", mnozenie);
//                break;
//            case "dzielenie":
//                double x4 = scanner.nextDouble();
//                double y4 = scanner.nextDouble();
//                dzielenie = x4 / y4;
//                System.out.printf("Dzielenie: %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x4, "/", y4, "=", dzielenie);
//                break;
//            default:
//                System.out.println("Blędny wybór");
//                break;
//        }

        //d)**j/w + skorzystaj z „ternary operator” zamiast standardowej instrukcji if-else

//        Scanner scanner = new Scanner(System.in);
//        Scanner string = new Scanner(System.in);
//        //^ z jednym Scannerem pomija wpisywanie stringa... ???
//
//        double suma;
//        double roznica;
//
//        System.out.println("Podaj x:");
//        double x = scanner.nextDouble();
//        System.out.println("Podaj y:");
//        double y = scanner.nextDouble();
//        System.out.println("Suma czy różnica?");
//        String dzialanie = string.nextLine();
//
//        suma = x + y;
//        roznica = x - y;
//        final PrintStream msg = dzialanie.equals("suma")
//                ? System.out.printf("Suma:    %1$-12.12s %2$s %3$-12.12s %4$s %5$s %n", x, "+", y, "=", suma)
//                : dzialanie.equals("różnica")
//                ? System.out.printf("Różnica: %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x, "-", y, "=", roznica)
//                : System.out.printf("błędny wybór");


        //e)**obsłuż sytuację, w której użytkownik poda wartość 0 podczas dzielenia

//        Scanner scanner = new Scanner(System.in);
//        double suma;
//        double roznica;
//        double mnozenie;
//        double dzielenie;
//
//        System.out.println("Suma, różnica, mnożenie czy dzielenie?");
//        String dzialanie = scanner.nextLine();
//
//        switch (dzialanie) {
//            case "suma":
//                double x1 = scanner.nextDouble();
//                double y1 = scanner.nextDouble();
//                suma = x1 + y1;
//                System.out.printf("Suma:      %1$-12.12s %2$s %3$-12.12s %4$s %5$s %n", x1, "+", y1, "=", suma);
//                break;
//            case "różnica":
//                double x2 = scanner.nextDouble();
//                double y2 = scanner.nextDouble();
//                roznica = x2 - y2;
//                System.out.printf("Różnica:   %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x2, "-", y2, "=", roznica);
//                break;
//            case "mnożenie":
//                double x3 = scanner.nextDouble();
//                double y3 = scanner.nextDouble();
//                mnozenie = x3 * y3;
//                System.out.printf("Mnożenie:  %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x3, "*", y3, "=", mnozenie);
//                break;
//            case "dzielenie":
//                double x4 = scanner.nextDouble();
//                double y4 = scanner.nextDouble();
//                boolean isIt0 = false;
//                while (!isIt0) {
//                    if (y4 == 0) {
//                        System.out.println("Nie dziel cholero przez zero ;)");
//                        System.out.println("Spróbuj jeszcze raz:");
//                        y4 = scanner.nextDouble();
//                    } else {
//                        isIt0 = true;
//                    }
//                }
//                dzielenie = x4 / y4;
//                System.out.printf("Dzielenie: %1$-12.12s %2$s %3$-12.12s %4$s %5$s", x4, "/", y4, "=", dzielenie);
//                break;
//            default:
//                System.out.println("Blędny wybór");
//                break;
//        }

        //2.
        //Napisz program, który pozwoli określić, czy wprowadzona przez użytkownika liczba:
        //a)Jest parzysta

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę:");
//        double x = scanner.nextDouble();
//
//        if (x % 2 == 0) {
//            System.out.println("Liczba jest parzysta");
//        } else {
//            System.out.println("liczba jest nieparzysta");
//        }

        //b)Jest podzielna przez drugą podaną liczbę

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę:");
//        double x = scanner.nextDouble();
//        System.out.println("Podaj dzielnik:");
//        double y = scanner.nextDouble();
//
//        if (x % y == 0) {
//            System.out.println("Liczba jest podzielna przez dzielnik");
//        } else {
//            System.out.println("Liczba nie jest podzielna przez dzielnik");
//        }

    }
}
