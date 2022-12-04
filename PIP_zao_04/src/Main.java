import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        Zadanie1();
//        Zadanie4();
//        Zadanie5();
//        Zadanie6();
        Zadanie8();
    }


    public static void Zadanie1(){
        boolean czyPada = false;
        boolean czySwieciSlonce = true;

//        if (czyPada == true && czySwieciSlonce == false) {
//            System.out.println("Plucha");
//        } else if (czyPada == true && czySwieciSlonce == true) {
//            System.out.println("Tecza");
//        } else if (czyPada == false && czySwieciSlonce == true) {
//            System.out.println("Slonecznie");
//        } else if (czyPada == false && czySwieciSlonce == false) {
//            System.out.println("Pochmurno");

        if (czyPada && !czySwieciSlonce) {
            System.out.println("Plucha");
        } else if (czyPada && czySwieciSlonce) {
            System.out.println("Tecza");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("Slonecznie");
        } else if (!czyPada && !czySwieciSlonce) {
            System.out.println("Pochmurno");
        }
    }



//    public static void Zadanie4(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe x: ");
//        float x = scanner.nextFloat();
//        System.out.println("Podaj liczbe y: ");
//        float y = scanner.nextFloat();
//        int wynik = 0;
//
////        int x1 = Math.round(x); //Opcja z zaokragleniem do pelnej liczby
////        int y1 = Math.round(y);
//
//        int x1 = (int)x;  //Opcja z przekonwerowaniem na int
//        int y1 = (int)y;
//
//        System.out.println("Podaj operacje (ADD, SUB, DIV, MUL): ");
//        String operacja = scanner.next();
//        scanner.close();
//
//        switch (operacja) {
//            case "ADD":
//                ADD(x1,y1);
//                break;
//            case "SUB":
//                System.out.println("Wynik: " + SUB(x1, y1));
//                break;
//            case "DIV":
//                System.out.println("Wynik: " + DIV(x1, y1));
//                break;
//            case "MUL":
//                System.out.println("Wynik: " + MUL(x1, y1));
//                break;
//            default:
//                System.out.println("Brak takiej operacji.");
//        }
//    }
//
//
//    public static void ADD(int x1, int y1) {
//        System.out.println("Wynik: " + (x1 + y1));
//    }
//    public static int SUB(int x1, int y1) {
//        return x1 - y1;
//    }
//    public static int DIV(int x1, int y1) {
//        return x1 / y1;
//    }
//    public static int MUL(int x1, int y1) {
//        return x1 * y1;
//    }



    public static void Zadanie5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe m: ");
        float m = scanner.nextFloat();
        System.out.println("Podaj liczbe n: ");
        float n = scanner.nextFloat();

//        int m1 = Math.round(m); //Opcja z zaokragleniem do pelnej liczby
//        int n1 = Math.round(n);

        int m1 = (int)m;  //Opcja z przekonwerowaniem na int
        int n1 = (int)n;

        System.out.println("Podaj operacje (ADD, SUB, DIV, MUL): ");
        String operacja = scanner.next();
        scanner.close();

        switch (operacja) {
            case "ADD":
                System.out.println("Wynik: " + ADD1(m1,n1));
                break;
            case "SUB":
                System.out.println("Wynik: " + SUB1(m1, n1));
                break;
            case "DIV":
                System.out.println("Wynik: " + DIV1(m1, n1));
                break;
            case "MUL":
                System.out.println("Wynik: " + MUL1(m1, n1));
                break;
            default:
                System.out.println("Brak takiej operacji.");
        }
    }


    public static int ADD1(int m1, int n1) {
        int wynik = m1 + n1;
        absoluteValue(wynik);
        return wynik;
    }
    public static int SUB1(int m1, int n1) {
        int wynik = m1 - n1;
        absoluteValue(wynik);
        return wynik;
    }
    public static int DIV1(int m1, int n1) {
        int wynik = m1 / n1;
        absoluteValue(wynik);
        return wynik;
    }
    public static int MUL1(int m1, int n1) {
        int wynik = m1 * n1;
        absoluteValue(wynik);
        return wynik;
    }


    public static int absoluteValue(int wynik){
        wynik = Math.abs(wynik);
        return wynik;
    }



    public static void Zadanie6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz 2 liczby rzeczywiste i nacidnij ENTER po kazdej z nich:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();
        if (a >= b) {
            double c = a;
            a = b;
            b = c;
        }
        System.out.println("Wybrany przedzial: [" + a + ", " + b + "]");

        Random random= new Random();
        double d1= a + random.nextDouble()*(b-a);
        double d2= a + random.nextDouble()*(b-a);
        double d3= a + random.nextDouble()*(b-a);
        System.out.println("Wartosci generowane losowo: ");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        double Tab[] = {d1, d2, d3};
        Arrays.sort(Tab);
        System.out.println("Gdzie: " + Tab[0] + " < " + Tab[1] + " < " + Tab[2]);
    }



    public static void Zadanie8(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walute:");
        System.out.println("    1 - PLN");
        System.out.println("    2 - JPY");
        String waluta = scanner.next();
        System.out.println("Wprowadz kwote: ");
        float kwota = scanner.nextFloat();
        scanner.close();

        switch (waluta) {
            case "1":
                float jpy = kwota * 30.27f;
                System.out.println(kwota + "zl" + " => " + jpy + "jpy");
                break;
            case "2":
                float pln = kwota / 30.27f;
                System.out.println(kwota + "jpy" + " => " + pln + "zl");
                break;
        }
    }


}