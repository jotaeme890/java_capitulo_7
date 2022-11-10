/**
 * 11 Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [10];
        boolean primo = false;

        for(int i = 0; i <10 ; i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("El array inicial sería: ");
        System.out.printf("índice    0      1      2      3      4      5      6      7      8      9 \n");
        System.out.print("Valor ");
        for(int i = 0; i <10 ; i++){
            System.out.printf("%6s " , num[i]);
        }

        System.out.println();
        System.out.println("El array cambiado sería: ");
        System.out.printf("índice    0      1      2      3      4      5      6      7      8      9 \n");
        System.out.print("Valor ");

        for(int i = 0; i <10 ; i++){
            primo = true;
            for(int b = 2; b < num[i] ; b++){
                if(num[i]%b == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.printf("%6s ", num[i]);
            } 
        }

        for(int i = 0; i <10 ; i++){
            primo = true;
            for(int b = 2; b < num[i] ; b++){
                if(num[i]%b == 0){
                    primo = false;
                }
            }
            if(!primo){
                System.out.printf("%6s ", num[i]);
            }
        }


        sc.close();
    }
}
