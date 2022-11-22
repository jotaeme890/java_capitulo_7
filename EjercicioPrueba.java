/**
 * 22 Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class EjercicioPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un valor: ");
        int fila = sc.nextInt();
        System.out.print("Dime un valor: ");
        int columna = sc.nextInt();
        int [] [] matriz = new int [fila] [columna]; //[i] [j]

        for(int i = 0; i<fila ; i++){
            for(int  j= 0; j<columna;  j++){
                if(i==j || i==0 || j==(columna-1) || j==0 || i==(fila-1) ||i==(fila-j)-1){
                    matriz[i][j] = 1;
                } else{
                    matriz[i][j] = 0;
                }
            }
        }

        for(int i = 0;i<fila;i++){
            for(int j= 0;j<columna;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }   
}
