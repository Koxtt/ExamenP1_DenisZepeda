/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenp1_deniszepeda;

import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class ExamenP1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1) Binarios a Decimal");
        System.out.println("2) Replace Manual");
        System.out.println("3) Reemplazo de Palabras");
        System.out.println("4) Salir del codigo");
        System.out.println("Ingrese una opcion valida dentro del codigo [1-4]");
        int opc = entry.nextInt();
        while (opc <= 1 || opc >= 4) {
            System.out.println("Error...Ingreso una opcion fuera del rango");
            System.out.println("---MENU---");
            System.out.println("1) Binarios a Decimal");
            System.out.println("2) Replace Manual");
            System.out.println("3) Reemplazo de Palabras");
            System.out.println("4) Salir del codigo");
            System.out.println("Ingrese una opcion valida dentro del codigo [1-4]");
            opc = entry.nextInt();
        }
        switch (opc) {
            case 1:
                m1();
                break;
            case 2:
                entry.nextLine();
                System.out.print("Ingrese la Primera cadena");
                String textoPrincipal = entry.nextLine();

                System.out.print("Ingrese la cadena por buscar");
                String buscar = entry.nextLine();
                m2(textoPrincipal, buscar);
                break;
            case 3:
                m3();
                break;
            case 4:
                System.out.println("Gracias por usar el programa");
                break;
        }
    }

    public static void m1() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Binarios a Decimal");
        System.out.print("Ingrese una cadena Binaria de 8 Caracteres: ");
        int cantnum = entry.nextInt();
        int num = entry.nextInt();
        while (cantnum==8) {            
            if (num >= 0 || num <= 1) {
                
            }
        }
    }

    public static void m2(String textoPrincipal, String buscar) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Contains Manual");

        boolean subcadena = true;

        if (subcadena == false) {
            System.out.print("La cadena SI contiene la subcadena");
        } else {
            System.out.print("La cadena NO contiene la cadena ");
        }
        

    }

    public static void m3() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Reemplazo de Palabras");

        System.out.print("Ingrese la Cadena: ");
        String cadena = entry.nextLine();

        System.out.print("Ingrese la palabra a buscar: ");
        String search = entry.next();

        System.out.print("Ingrese la palabra de reemplazo: ");
        String replace = entry.next();

        String WordReplace = cadena.replace(search, replace);

        System.out.println("Resultado: " + WordReplace);
    }

}

