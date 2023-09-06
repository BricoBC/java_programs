// definir una variable de instancia nombredelcurso 
// Define metodos para establecer (seller) y obtener (getter)
//su valor 

public class LibroCalificaciones3
{
	private String nombreDelCurso, nombreDelProf;
	private int horasdelcurso;

	public void establecerparametrosdelcurso(String nombreDelCursor, String nombreDelProfe, int horasdelcursor)
	{
		this.nombreDelCurso= nombreDelCursor;
		this.nombreDelProf=nombreDelProfe;
		this.horasdelcurso=horasdelcursor;
	}
	public String obtenernombredelcurso()//el metodo es el de color verde.
	{
		return nombreDelCurso;
	}
	public String obtenernombredelprofe()
	{
		return nombreDelProf;
	}
	public int obtenerhorasdelcurso()
	{
		return horasdelcurso;
	}
    public void mostrarMensaje()
	{
		System.out.printf("Bienvenido al libro de calificaciones para \n%s\n",obtenernombredelcurso());
		System.out.printf("El nombre del profe es: \n%s\n",obtenernombredelprofe());
		System.out.printf("Horassssssssssssss: \n%d\n",obtenerhorasdelcurso());		
	}
}