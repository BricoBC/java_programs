import java.util.Scanner; //scanner es una clase

public class PruebaLibroCalificaciones5
{
	public static void main (String args[])
	{ 
	    Scanner entrada;
	    entrada =new Scanner(System.in);

		LibroCalificaciones5 libroCalificaciones5A = new LibroCalificaciones5("Programacion Orientada a Objetos","Ana Luisa");
		LibroCalificaciones5 libroCalificaciones5B = new LibroCalificaciones5("Lenguaje de Programacion Orientada a Objetos","Cuahutemoc");
		System.out.printf("El nombre del curso de LibroCalificaciones5A es: %s \n",libroCalificaciones5A.obtenerNombreDelCurso());
		System.out.printf("El nombre del curso de LibroCalificaciones5B es: %s \n",libroCalificaciones5B.obtenerNombreDelCurso());		
		System.out.printf("El nombre del profe de Programacion Orientada a Objetos es: %s \n",libroCalificaciones5A.obtenerNombreDelProfesor());		
		System.out.printf("El nombre del profe de Lenguaje de Programacion Orientada a Objetos es: %s \n",libroCalificaciones5B.obtenerNombreDelProfesor());		
		System.out.println("¿Te gustaría modificar el nombre de la materia?");
		String contestar = entrada.nextLine();
		
			System.out.println("Escriba el nombre del curso: ");
			String nombreDelCurso = entrada.nextLine();
			System.out.println();
			


			System.out.println("Escriba el nombre del profe: ");
			String nombredelProfe = entrada.nextLine();
			System.out.println();

			System.out.printf("el nombre del Profe es: %s \n",nombredelProfe);
			System.out.printf("el nombre del curso es: %s \n",nombreDelCurso);
	}
}