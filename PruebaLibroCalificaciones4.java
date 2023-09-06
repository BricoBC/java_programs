public class PruebaLibroCalificaciones4
{
	public static void main (String args[])
	{
		LibroCalificaciones4 libroCalificaciones4A= new LibroCalificaciones4("Programación Orientada a Objetos");
		LibroCalificaciones4 libroCalificaciones4B= new LibroCalificaciones4("Lenguaje de Programación Orientada a Objetos");
		System.out.printf("El nombre del curso de LibroCalificaciones4A es: %s \n",libroCalificaciones4A.obtenerNombreDelCurso());
		System.out.printf("El nombre del curso de LibroCalificaciones4B es: %s \n",libroCalificaciones4B.obtenerNombreDelCurso());		
	}
}