/**
 * 32 Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el 
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * @author jotaeme
 */


public class Ejercicio32 {
    public static void main(String[] args) {
        int [] [] num = new int [10][10];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num [i][j] = (int)(Math.random()*101+200);

                if(i==j){
                    System.out.printf("%5d",num[i][j]);
                } else{
                    System.out.printf("%5d", 0);
                }
                if(j==9){
                    System.out.println();
                }
            }
        }
    }
}
