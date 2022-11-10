/**
 * 16 Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
 * escribiendo los números que se quieren resaltar entre corchetes.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [20];
        int mul5 = 0;
        int mul7 = 0;

        for(int i = 0; i <20 ; i++){
            num [i] = (int)(Math.random()*401);
            System.out.print(num[i] + " ");
        }
        
        System.out.println("");
        System.out.println("1) Múltiplo 5");
        System.out.println("2) Múltiplo 7");
        System.out.print("Que dato quieres sacar: ");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
            for(int i = 0; i<20;i++){ //comprobamos número a número del array cuál es menor, y lo guardamos en mínimo para su posterior uso
                if(num[i]%5==0){
                    mul5 = num[i];
                } 
            }
            for(int i = 0; i<20;i++){ 
                if(num[i]==mul5){
                    System.out.print("["+num[i]+"]");
                } else{
                    System.out.print(num[i] + " ");
                }
            }
            break;

            case 2:
            for(int i = 0; i<20;i++){ //comprobamos número a número del array cuál es mayor, y lo guardamos en mínimo para su posterior uso
                if(num[i]%7==0){
                    mul7 = num[i];
                } 
            }
            for(int i = 0; i<20;i++){
                if(num[i]==mul7){
                    System.out.print("["+num[i]+"]");
                } else{
                    System.out.print(num[i] + " ");
                }
            }
            break;
        }
        sc.close();
    }
}
