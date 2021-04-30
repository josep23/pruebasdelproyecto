import java.security.KeyStore;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean matriz[][] = new boolean[5][5];


        System.out.println(matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + " | " + matriz[0][3] + " | " + matriz[0][4] );
        System.out.println(matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " | " + matriz[1][4]);
        System.out.println(matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " | " + matriz[2][4]);
        System.out.println(matriz[3][0] + " | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " | " + matriz[3][4]);
        System.out.println(matriz[4][0] + " | " + matriz[4][1] + " | " + matriz[4][2] + " | " + matriz[4][3] + " | " + matriz[4][4]);

        System.out.println("/                        /");
        System.out.println("Dime Y");
        int Y = sc.nextInt();
        if (Y>4){
            System.out.println("ERROR DE Y");
        }
        System.out.println("Dime X");
        int X = sc.nextInt();
        if (X>4){
            System.out.println("ERROR DE X");
        }


/*
for (int i = 0; i < 5; i++){
    for(int j = 0; j < 5; j++){
    }
}
 */
        for (int i = 0; i < 10; i++) {

            if ( X > 0){
                if (matriz[Y][X]=false){
                    matriz[Y][X]=true;
                }
                else if (matriz[Y][X]=true){
                    matriz[Y][X]=false;
                }
                X=X-1;
                if (matriz[Y][X]=false){
                    matriz[Y][X]=true;
                }
                else if (matriz[Y][X]=true){
                    matriz[Y][X]=false;
                }

            }
            System.out.println(matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + " | " + matriz[0][3] + " | " + matriz[0][4] );
            System.out.println(matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + " | " + matriz[1][4]);
            System.out.println(matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + " | " + matriz[2][4]);
            System.out.println(matriz[3][0] + " | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3] + " | " + matriz[3][4]);
            System.out.println(matriz[4][0] + " | " + matriz[4][1] + " | " + matriz[4][2] + " | " + matriz[4][3] + " | " + matriz[4][4]);

            System.out.println("/                        /");
            System.out.println("Dime Y");
             Y = sc.nextInt();
            if (Y>4){
                System.out.println("ERROR DE Y");
            }
            System.out.println("Dime X");
             X = sc.nextInt();
            if (X>4){
                System.out.println("ERROR DE X");
            }

        }

    }
}
