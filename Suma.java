import java.awt.*;
import java.awt.event.*;

public class Suma
{

	private Frame f;
	private Label li,la, lb, ls;
	private TextField ta, tb, ts;
	private Button bsuma, bsalir, bmultiplicar, bdividir, brestar;
	private Panel pan, pac, pas;
	
	public Suma()
	{
		f = new Frame("Suma de dos numeros");
		li = new Label("Introdusca en los cuadros de texto los 2 numeros a sumar. Posteriormente de clic en el boton Suma.");
		la = new Label("Introdusca el numero 1: ");
		lb = new Label("Introdusca el numero 2: ");
		ls = new Label("Resultado: ");

		bsuma = new Button("Sumar");
		bmultiplicar = new Button("Multiplicar");
		bdividir = new Button("Dividir");
		brestar = new Button("Restar");
		bsalir = new Button("Salir");

		ta = new TextField(5);
		tb = new TextField(5);
		ts = new TextField(8);
		 
		pan = new Panel();
		pac = new Panel();
		pas = new Panel();		
	}

	public void acomodarEnFrame(){
		bsuma.addActionListener(new ManejadorBoton());
		bsalir.addActionListener(new SalirBoton());
		bmultiplicar.addActionListener(new ManejadorBotonM());
		bdividir.addActionListener(new ManejadorBotonD());
		brestar.addActionListener(new ManejadorBotonR());


		pan.add(li);
		f.add(pan, BorderLayout.NORTH);


		pac.setLayout(new GridLayout(4,2));
		pac.add(la); pac.add(ta);
		pac.add(lb); pac.add(tb);
		pac.add(ls); pac.add(ts);
		f.add(pac, BorderLayout.CENTER);

		pas.setLayout(new GridLayout(1,2));
		pas.add(bsuma); pas.add(bmultiplicar); pas.add(bdividir); pas.add(brestar); pas.add(bsalir);

		f.add(pas, BorderLayout.SOUTH);

		f.setSize(480, 240);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});

	}

	public static void main(String args[])
	{
		Suma iguSuma = new Suma();
		iguSuma.acomodarEnFrame();
	}
	class ManejadorBoton implements ActionListener{
		public void actionPerformed (java.awt.event.ActionEvent accionEvento){
			int na, nb, sab;
			String res;
			na = Integer.parseInt(ta.getText());
			nb = Integer.parseInt(tb.getText());
			sab = na + nb;
			res = Integer.toString(sab); 
			ts.setText(res);
		}
	}

	class SalirBoton implements ActionListener{
		public void actionPerformed(java.awt.event.ActionEvent accionEvento){
			System.exit(0);
		}
	}

	class ManejadorBotonM implements ActionListener{
		public void actionPerformed (java.awt.event.ActionEvent accionEvento){
			int na, nb, sab;
			String res;
			na = Integer.parseInt(ta.getText());
			nb = Integer.parseInt(tb.getText());
			sab = na * nb;
			res = Integer.toString(sab); 
			ts.setText(res);
		}
	}

	class ManejadorBotonD implements ActionListener{
		public void actionPerformed (java.awt.event.ActionEvent accionEvento){
			float na, nb, sab;
			String res;
			na = Integer.parseInt(ta.getText());
			nb = Integer.parseInt(tb.getText());
			sab = na / nb;
			res = Double.toString(sab); 
			ts.setText(res);
		}
	}
	class ManejadorBotonR implements ActionListener{
		public void actionPerformed (java.awt.event.ActionEvent accionEvento){
			int na, nb, sab;
			String res;
			na = Integer.parseInt(ta.getText());
			nb = Integer.parseInt(tb.getText());
			sab = na - nb;
			res = Integer.toString(sab); 
			ts.setText(res);
		}
	}

}