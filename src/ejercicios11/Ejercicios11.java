/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios11;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.fill;
import static java.util.Arrays.sort;

/**
 *
 * @author silvio
 */
public class Ejercicios11 {

    static int[][] matriz
            = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}

            };

    static String[] nombre = {"Carlos", "Miguel", "Iván", "Benjamín", "Francisco", "Erik", "Alexis Jose", "Marcos", "Cristopher", "Mauricio", "Jose Simon", "Nuria Maria"};
    static String[] apellido1 = {"Alvarez", "Candeira", "Casas", "Dominguez", "Fernandez", "Ferreira", "Giraldez", "Gonzalez", "Juncal", "Montes", "Sanchez", "da Silva", "Suarez"};
    static String[] apellido2 = {"Sanchez", "Carrera", "Cerqueira", "Fernandez", "Araujo", "Oset", "Groba", "Pereira", "Abeledo", "Iglesias", "Gonzalez", "Vilas"};

    static int[] numeros = {2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
    static int[] numeros2 = {2001, 2002, 2003, 2004, 2005, 2016, 2007, 2008, 2009, 2010};

    public static void main(String[] args) {
        ejercicio04();
    }

    public static void ejercicio01() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int tamArray = -1;
        do {
            System.out.print("Por favor, inserte el tamaño del array: ");
            if (sc.hasNextInt()) {
                tamArray = sc.nextInt();
            }
            if (tamArray < 0) {
                System.out.println("ERROR: Debe insertar un numero entero");
            }
            sc.nextLine();
        } while (tamArray < 0);
        int valInicial = 0;
        boolean done = false;
        do {
            System.out.print("Por favor, inserte el valor inicial para todas las posiciones: ");
            if (sc.hasNextInt()) {
                valInicial = sc.nextInt();
                done = true;
            }

            sc.nextLine();
        } while (!done);
        int[] array = new int[tamArray];
        fill(array, valInicial);
        System.out.println(java.util.Arrays.toString(array));
        
    }
    
    public static void ejercicio02() {
        sort(nombre);
        sort(apellido1);
        sort(apellido2);
        System.out.println(java.util.Arrays.toString(nombre));
        System.out.println(java.util.Arrays.toString(apellido1));
        System.out.println(java.util.Arrays.toString(apellido2));
        
    }  
    
    public static void ejercicio03() {
        sort(apellido1);
        sort(apellido2);        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Introduce un apellido para comprobar: ");
        String sUsuario = sc.nextLine();
        if(Arrays.binarySearch(apellido1, sUsuario)>=0 || Arrays.binarySearch(apellido2, sUsuario)>=0){
            System.out.println("si existe");
        }else{
            System.out.println("no existe");
        }
    }
    
    public static void ejercicio04() {
        System.out.printf("La primera posicion en la que difieren es en la %s\n",Arrays.mismatch(numeros, numeros2));
    }

}
