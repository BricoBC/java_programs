//crea un objeto LibroCalificaciones y pasa un objeto string
//al metodo mostrarmensaje 
import java.util.Scanner; //scanner es una clase
public class PruebaLibroCalificaciones2
{
	public static void main(String[] args)
		{
			Scanner entrada; //la variable es "entrada" que sera abalado por la clase "Scanner"
			entrada=new Scanner(System.in);//system.in sirve para el teclado 

			LibroCalificaciones2 miLibroCalificaciones2 = new LibroCalificaciones2();
			System.out.println("Escriba el nombre del curso: ");
			String nombredelCursor = entrada.nextLine();
			System.out.println();

			System.out.println("Escriba el nombre del profesor: ");
			String nombredelProfe = entrada.nextLine();
			System.out.println();

			miLibroCalificaciones2.mostrarMensaje(nombredelCursor,nombredelProfe);
		}
}