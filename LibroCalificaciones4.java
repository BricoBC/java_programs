public class LibroCalificaciones4
{
	private String nombreDelCurso;
	public LibroCalificaciones4(String nombre)
	{
		nombreDelCurso=nombre;
	}
	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso=nombre;
	}
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}
	public void Mostrarmensaje()
	{
		System.out.printf("bienvenido a libro calificaciones para \n %s! \n",obtenerNombreDelCurso());
	}
}