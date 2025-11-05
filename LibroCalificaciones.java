import java.util.Scanner;

public class LibroCalificaciones {
    
    private String nombreDelCurso;

    public LibroCalificaciones( String nombre )
    {
        nombreDelCurso = nombre;
    }
    
    public void establecerNombreDelCurso( String nombre)
    {
        nombreDelCurso = nombre;
    }

    public String obtenernombreDelCurso()
    {
        return nombreDelCurso;
    }

    public void mostrarmensaje()
    {
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n", obtenernombreDelCurso() );
    }

    public void determinarPromedioClase()
    {
        Scanner entrada = new Scanner(System.in);

        int total;
        int contadorCalificaciones;
        int calificacion;
        double promedio;

        total = 0;
        contadorCalificaciones = 1;

        while ( contadorCalificaciones <= 10 )
        {
            System.out.print("Escriba la calificacion: ");
            calificacion = entrada.nextInt();
            total = total + calificacion;
            contadorCalificaciones = contadorCalificaciones + 1;
        }

        promedio = total/ 10;

        System.out.println("El total de las calificaciones es: " + total);
        System.out.printf("El promedio de la clase es %.2f\n", promedio);
    }

}
    