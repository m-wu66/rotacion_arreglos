
package rotacion_arreglos;

import java.util.Scanner;

public class RotacionArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Llenar arreglo
        int tabla[] = new int[10];
        int ultimo, N;
        
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Ingrese un numero: ");
            tabla[i] = sc.nextInt();
        }
        
        //Numero de rotaciones
        System.out.print("Introduzca el numero de veces que quiere que se recorra: ");
        N = sc.nextInt();
        
        //Rotaciones
        for(int i=0; i<N; i++){
            ultimo = tabla[9];
            for(int c = 8; c>=0; c--){
                tabla[c+1]=tabla[c];
            }

            tabla[0] = ultimo;
        }
        
        //Resultado
        System.out.println("Rotacion en el arreglo: ");
        for(int i: tabla){
            System.out.println(i);
        }
        sc.close();
    }
    
}
