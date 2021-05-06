import java.util.Scanner;

public class Main {


    public static void mostrarTablero(boolean matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==false){
                    System.out.print(" | " + " ᕙ(`▿´)ᕗ " + " | ");
                }
                else if (matriz[i][j]==true){
                    System.out.print(" | " + "  (•◡•) / " + " | ");
                }

                    //System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Boolean juego = true;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int Filas = 5;
        int Columnas = 5;

        boolean matriz[][] = new boolean[Columnas][Filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = false;
                matriz[0][0]=true;
                matriz[1][0]=true;
                matriz[2][0]=true;
                matriz[1][1]=true;

                matriz[1][2]=true;
                matriz[2][2]=true;
                matriz[2][1]=true;
                matriz[2][3]=true;
                matriz[3][2]=true;
            }
        }


        mostrarTablero(matriz);

        while (juego != false) {

            System.out.println();
            System.out.println("Dime Y");
            int Y = sc.nextInt();
            System.out.println("Dime X");
            int X = sc.nextInt();


            if (Y >= 0 && Y < matriz.length && X >= 0 && X < matriz.length) {

                matriz[Y][X] = !matriz[Y][X];

                if (X == 0) {
                    X = X + 1;
                    matriz[Y][X] = !matriz[Y][X];
                    X = X - 1;
                } else if (X == matriz.length - 1) {
                    X = X - 1;
                    matriz[Y][X] = !matriz[Y][X];
                    X = X + 1;
                } else {
                    X = X - 1;
                    matriz[Y][X] = !matriz[Y][X];
                    X = X + 2;
                    matriz[Y][X] = !matriz[Y][X];
                    X = X - 1;
                }

                if (Y == 0) {
                    Y = Y + 1;
                    matriz[Y][X] = !matriz[Y][X];
                    Y = Y - 1;
                } else if (Y == matriz.length - 1) {
                    Y = Y - 1;
                    matriz[Y][X] = !matriz[Y][X];
                    Y = Y + 1;
                } else {
                    Y = Y - 1;
                    matriz[Y][X] = !matriz[Y][X];
                    Y = Y + 2;
                    matriz[Y][X] = !matriz[Y][X];
                    Y = Y - 1;
                }
                contador=0;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        if (matriz[i][j] == false) {
                            contador++;
                        }
                    }
                }
                if (contador == 25) {

                    System.out.println("██╗░░░██╗██╗░█████╗░████████╗░█████╗░██████╗░██╗░█████╗░");
                    System.out.println("██║░░░██║██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║██╔══██╗");
                    System.out.println("╚██╗░██╔╝██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝██║███████║");
                    System.out.println("░╚████╔╝░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗██║██╔══██║");
                    System.out.println("░░╚██╔╝░░██║╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║██║██║░░██║");
                    System.out.println("░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚═╝");
                    juego = false;
                }

               else {
                    mostrarTablero(matriz);
               }

            } else {
                System.out.println("Coordenadas erroneas");
                juego = false;
            }
        }
    }
}