/**
 * 10 Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 *necesario.
 * 
 * @author jotaeme
 */



public class Ejercicio10 {
    public static void main(String[] args) {
        int [] numeros = new int [20];

        for(int i = 0; i<20;i++){
            numeros [i] = (int)(Math.random()*101);
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("Después del cambio quedaría: ");
        for(int i = 0; i<20;i++){ //Ponemos los pares
            if(numeros[i]%2==0){
                System.out.print(numeros[i] +" ");
            }
        }
        for(int i = 0; i<20;i++){ //Impares
            if(numeros[i]%2!=0){
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
