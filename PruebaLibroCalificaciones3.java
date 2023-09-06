import java.util.Scanner;

public class PruebaLibroCalificaciones3
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);

		LibroCalificaciones3 miLibroCalificaciones3;
		miLibroCalificaciones3 = new LibroCalificaciones3();

		System.out.printf("El nombre del curso es: %s\n"+
			"el profesor es: %s\n" +
			"las horas del curso son: %s\n",
			miLibroCalificaciones3 obtenernombredelcurso().
			miLibroCalificaciones3.obtenernombredelProfe().
			miLibroCalificaciones3.obtenerhorasdelcurso());
	}
}