 import java.awt.*;
 public class MiCanvas extends Canvas
 {
 	public void paint(Graphics g)
 	{
 		int w = size().width;
 		int h = size().height;

 		g.drawRect(0, 0, w-1, h-1);//Cordenada de inicio lugar izquierdo, cordenada de panel derecho, w y h son limites inferiorers
 		g.drawLine(10, 10, 100, 100);//linea
 		g.fillRect(9, 9, 3 ,3);//rectangulo relleno
 		g.drawString("(10,10)", 13, 20);//mostramos cadena de caracteres

		g.fillRect(49, 49, 3 ,3);
 		g.drawString("(50,50)", 53, 50);

 		g.fillRect(99, 99, 3 ,3);
 		g.drawString("(100,100)", 103, 100);

 	}
 }