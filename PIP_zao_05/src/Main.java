import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Zadanie1();
//        Zadanie2();
//        Zadanie3a();
//        Zadanie3b();
        Zadanie4();
    }


    public static void Zadanie1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita n: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n>0){
            while (n>=0) {
                System.out.println(n);
                n--;
            }
        } else if (n<0) {
            while (n<=0) {
                System.out.println(n);
                n++;
            }
        }
    }


    public static void Zadanie2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ktora liczbe Fibonaciego wypisac (zaczynajac od zerowej): ");
        int fib = scanner.nextInt();
        int fibCon = fib;
        scanner.close();
        long fib1=0, fib2=1, fib3=0;
        if (fib==0) {
            System.out.println("F0 = 0");
        } else if (fib==1) {
            System.out.println("F1 = 1");
        } else if (fib>1) {
            while (fib>1) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                fib--;
            }
            System.out.println("F"+fibCon+" = "+fib3);
        }
    }


    public static void Zadanie3a(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita dodatnia: ");
        int trojkat = scanner.nextInt();
        scanner.close();
        for (int i=0; i<=trojkat-1; i++){
            for (int j=i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void Zadanie3b(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita dodatnia: ");
        int choinka = scanner.nextInt();
        scanner.close();
        for (int i=0; i<choinka; i++){
            for (int j=0; j<choinka*2; j++){
                if (j<(choinka-i) || j>(choinka+i)){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void Zadanie4(){
        int x=5, y=3, z=8;
        int max = Math.max(Math.max(x,y),z);
        for (int i=1; i<=max; i++) {
            if (i <= max-x) {
                System.out.print("   ");
            } else {
                System.out.print(" * ");
            }
            if (i <= max-y) {
                System.out.print("   ");
            } else {
                System.out.print(" * ");
            }
            if (i <= max-z) {
                System.out.print("   ");
            } else {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


}