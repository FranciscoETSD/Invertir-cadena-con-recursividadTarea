import java.util.Scanner;

public class main {
    public static class InvertirCadenaRecursivo {

        private static Scanner sc;

        public static void main(String[] args) {
            sc = new Scanner(System.in);
            System.out.print("Introduce una cadena de texto: ");
            String cadena = sc.nextLine();
            sc.close();
            System.out.println("Realizando la inversion ....");
            String invertida = invertirCadena(cadena);
            System.out.println("-----------------------------------------------------");
            System.out.printf("Cadena introducida: %s%n", cadena);
            System.out.printf("Cadena invertida: %s", invertida);
            System.out.println();
            System.out.println("-----------------------------------------------------");
            System.out.println();
            System.out.println("Se realizo la  inversion con exito ...");
        }

        private static String invertirCadena(String cadena) {
            if (cadena.length() == 1) {
                return cadena;
            } else {
                return invertirCadena(cadena.substring(1)) + cadena.charAt(0);

            }
        }
    }

    /*
    Metodo recursivo para comparardos vectores de enteros elemento por elementi¿o
    vector1 = {5, 6, 2}
    vector2 = {2, 9, 2}
    diferen = 3 + -3 + 0 = 0 = 6
     */
    private static int compararVectores(int[] vector1, int[] vector2, int indice) {
        int sumaDiferencias;

        if (indice == vector1.length - 1) { // caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        } else { //llamada recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }

        return sumaDiferencias;
    }
    /*
    Metodo auxiliar que realiza la llamada al metodo recursivo
     */
    public static boolean compararVectores(int[] vector1, int[] vector2) {
        return compararVectores(vector1,vector2,0) == 0;
    }
}
