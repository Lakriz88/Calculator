import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nummer1;
        int nummer2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hei og velkommen til denne kalkulatorversjonen." + "\n" + "Tast inn det første taller:");

        nummer1 = scanner.nextInt();

        System.out.println("Skriv inn siste tall");

        nummer2 = scanner.nextInt();

        System.out.println("Skriv inn for ønsket operasjon; + for addisjon, - for subtraksjon, * for multiplikasjon, / for divisjon og % for modulus");

    String operasjon;

        operasjon = scanner.next();
        switch (operasjon) {
            case "+":
                System.out.println(add(nummer1, nummer2));
                break;
            case "-":
                System.out.println(sub(nummer1, nummer2));
                break;
            case "*":
                System.out.println(multi(nummer1, nummer2));
                break;
            case "/":
                System.out.println(div(nummer1, nummer2));
                break;
            case "%":
                System.out.println(mod(nummer1, nummer2));
                break;
            default:
                System.out.println("Ikke et godkjent symbol");

        }


                //Case: tast inn ønsket problemløsningsverktøy; addisjon, subtraksjon, multiplikasjon, dvisjon eller modulus.



    }

    private static int add(int x, int y){
        int result = x + y;
        return  result;
    }

    private static int sub(int x, int y){
        int result = x - y;
        return result;
    }

    private static int multi(int x, int y){
        int result = x * y;
        return result;
    }

    private static int div(int x, int y){
        int result = x / y;
        return result;
    }

    private static int mod(int x, int y){
        int result = x % y;
        return result;
    }

}
