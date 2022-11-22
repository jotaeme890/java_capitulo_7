import java.util.Scanner;


public class EjercicioPrueba3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un valor: ");
        int fila = sc.nextInt();
        System.out.print("Dime un valor: ");
        int columna = sc.nextInt();
        int [] [] matriz = new int [fila] [columna]; //[i] [j]

        for(int i = 0; i<fila ; i++){
            for(int  j= 0; j<columna;  j++){
                if(j%2 == 0){
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
