
package com.mycompany.lab4p1_lloydcooper;

import java.util.Scanner;

public class Lab4P1_LloydCooper {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //dos strings
       // podemos usar substring en el tercero
       char resp = 's';
        int opcion;
        
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1. Substitute ");
            System.out.println("2. Palíndromas ");
            System.out.println("3. Contenida o no ");
            System.out.println("4. Salida ");
            
            opcion = leer.nextInt();
            //Lloyd Cooper 12211056
            switch (opcion){
                case 1:
                    System.out.print("Ingrese una cadena (con el símbolo %d): ");
                    leer.nextLine();
                    String original = leer.nextLine();
                    int index = 0;
                    for (int i = 0; i < original.length(); i++) {
                        if (original.charAt(i) == '%') {
                            index = i;
                        }
                    }
                    System.out.println(index);
                    while (index == -1 ) {
                        System.out.println("La cadena no contiene el símbolo %d");
                        System.out.print("Ingrese una cadena (con el símbolo %d): ");
                        original = leer.nextLine();
                        break;
                    }

                    System.out.print("Ingrese cadena que hará la sustitución: ");
                    String sustitucion = leer.nextLine();
                    System.out.println(index);

                    String resultado = original.substring(0, index) + sustitucion + original.substring(index + 2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese una palabra: ");
                    String palabra = leer.next();

                    boolean esPalindroma = true;
                    int length = palabra.length();

                    for (int i = 0; i < length; i++) {
                        char izquierda = palabra.charAt(i);
                        char derecha = palabra.charAt(length - i - 1);

                        if (Character.toLowerCase(izquierda) != Character.toLowerCase(derecha)) {
                            esPalindroma = false;
                            break;
                        }
                    }

                    if (esPalindroma) {
                        System.out.println("La palabra es palíndroma.");
                    } else {
                        System.out.println("La palabra no es palíndroma.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese una cadena(larga): ");
                    leer.nextLine();
                    String larga = leer.nextLine();
                    System.out.println("Ingrese una cadena(corta): ");
                    String corta = leer.next();
                    
                    boolean isContained = false;
                    for (char i = 0; i < larga.length() - corta.length() + 1; i++) {
                        if (larga.substring(i, i + corta.length()).equals(corta)) {
                            isContained = true;
                            break;
                        }
                    }
                        
                    if (isContained) {
                        System.out.println("La cadena corta está contenida en la cadena larga.");
                    } else {
                        System.out.println("La cadena corta no está contenida en la cadena larga.");
                    }
                    break;
                case 4:
                    resp = 'n';
                    break;
                default:
            }
        }     
    }
}
