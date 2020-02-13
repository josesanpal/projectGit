/*
SUBPROGRAMAS METODOS: FUNCION + PROCEDIMINETO
CONVERIONES
 */
package santos.p17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SantosP17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        /*double price, tax, pvp;
        price = 100;
        tax = 21;
        pvp = functionGerard(price, tax);
        System.out.println(pvp);
    }
    
    private static double functionGerard(double precio, double iva){
    double result =0;
    //calculo
    result = precio * iva/100+precio;
    return result;
    }*/
        System.out.println("Author Jose Santos");
        int option = -1;
        int euroint, monedaint, littir, entero, number;
        float monedafloat, eurofloat;
        String monedastring, eurostring, binnir, name, result, change, hexadecimal;
        char letter;
        DecimalFormat dd = new DecimalFormat("000€");
        DecimalFormat dc = new DecimalFormat("000.000x");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How much money do you have?");
                    euroint = keyboard.nextInt();
                    monedafloat = solucion(euroint);
                    System.out.println(dd.format(euroint) + " = " + dc.format(monedafloat));
                    System.out.println(monedafloat);
                    break;
                case 2:
                    System.out.println("How much money do you have?");
                    euroint = keyboard.nextInt();
                    double moneda = solucion2(euroint);
                    System.out.println(dd.format(euroint) + " = " + dc.format(moneda));
                    break;
                case 3:
                    System.out.println("How much money do you have?");
                    euroint = keyboard.nextInt();
                    monedastring = solucion3(euroint);
                    System.out.println(dd.format(euroint) + " = " + monedastring + "x");
                    break;
                case 4:
                    System.out.println("How much money do you have?");
                    eurostring = keyboard.next();
                    monedaint = solucion4(eurostring);
                    System.out.println(eurostring + "€ = " + dc.format(monedaint));
                    break;
                case 5:
                    System.out.println("How much money do you have?");
                    eurofloat = keyboard.nextFloat();
                    monedaint = solucion5(eurofloat);
                    System.out.println(dd.format(eurofloat) + " = " + dc.format(monedaint));
                    break;
                case 6:
                    System.out.println("How much money do you have?");
                    eurofloat = keyboard.nextFloat();
                    monedastring = solucion6(eurofloat);
                    System.out.println(dd.format(eurofloat) + " = " + monedastring + "x");
                    break;
                case 7:
                    System.out.println("Say me one letter");
                    letter = keyboard.next().charAt(0);
                    littir = (int) letter;
                    binnir = solucion7(littir);
                    System.out.println(littir + " = int\n" + binnir + " = binario");
                    break;
                case 8:
                    System.out.println("What is your name?");
                    name = "jose";//keyboard.next();
                    entero = Integer.valueOf(name);
                    result = solucion8(entero);
                    System.out.println(result);
                    break;
                case 9:
                    System.out.println("Say me a number between 0 and 255");
                    number = keyboard.nextInt();
                    change = solucion9(number);
                    System.out.println(change);
                    break;
                case 10:
                    System.out.println("American Standard Code for Information Interchange");
                    int I;
                    for (I = 32; I < 64; I++) {
                        hexadecimal = solucion10(I);
                        System.out.print(I + " - " + (char) I + " - "+ hexadecimal +"\t");
                        hexadecimal = solucion10(I+32);
                        System.out.print((I + 32) + " - " + (char) (I + 32) + " - "+ hexadecimal +"\t");
                        hexadecimal = solucion10(I+64);
                        System.out.print((I + 64) + " - " + (char) (I + 64) + " - "+ hexadecimal +"\t");
                        System.out.println("");
                    }
                    
                    break;
                case 0:
                    System.out.println("Thanks for use our aplication");
                    break;
                default:
                    System.out.println("option don't valid");
            }
        }
    }

    private static float solucion(int dinero) {
        float moneda = (float) dinero;
        return moneda;
    }

    private static double solucion2(int dinero) {
        double cambio = (double) dinero;
        return cambio;
    }

    private static String solucion3(int dinero) {
        String cambio = String.valueOf(dinero);
        return cambio;
    }

    private static int solucion4(String dinero) {
        int cambio = Integer.parseInt(dinero);
        return cambio;
    }

    private static int solucion5(float dinero) {
        int cambio = (int) dinero;
        return cambio;
    }

    private static String solucion6(float dinero) {
        String cambio = Float.toString(dinero);
        return cambio;
    }

    private static String solucion7(int littir) {
        String binnir = Integer.toBinaryString(littir);
        return binnir;
    }

    private static String solucion8(int prebi) {
        String binario = Integer.toBinaryString(prebi);
        return binario;
    }

    private static String solucion9(int number) {
        String cambio = new Character((char) number).toString();
        return cambio;
    }

    private static String solucion10(int hexa) {
        String hexastring = Integer.toHexString(hexa);
        return hexastring;
    }

    private static void userMenu() {
        System.out.println("Opción 0 - Exit");
        System.out.println("Opción 1 - Number");
        System.out.println("Opción 2 - Monlau");
        System.out.println("Opción 3 - Sweets");
        System.out.println("Opción 4 - Phone");
        System.out.println("Opción 5 - Runners");
        System.out.println("Opción 6 - Number");
        System.out.println("Opción 7 - Monlau");
        System.out.println("Opción 8 - Sweets");
        System.out.println("Opción 9 - Phone");
        System.out.println("Opción 10 - Runners");
    }

}//FIN DE CLASS
