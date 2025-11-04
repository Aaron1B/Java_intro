import java.util.Scanner;

public class Bienvenido2 {
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int producto;

        System.out.print("Escriba el primer entero:");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero:");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer entero:");
        numero3 = entrada.nextInt();

        producto = numero1 * numero2 *numero3;

        System.out.printf("El producto es %d\n", producto);

    }

}
