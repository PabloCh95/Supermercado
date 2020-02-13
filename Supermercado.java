package ejer2colecciones;
/*2)En un supermercado se mantiene una cola A con diversos 
 * clientes de los que se conoce número de ubicación en la cola y
 * cantidad de productos que lleva. Se abre una nueva cola B 
 * para clientes que llevan menos de 5 productos. Usted debe dejar
 * en la cola A los clientes que llevan más de 5 o hasta 5 productos
 * en el ordenen que estaban, y en la cola B los que compran menos
 * de 5 artículos, respetando el orden que tenían en la cola A.
 * En ambas colas reasignar un nuevo número de ubicación.
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Stack;
public class Supermercado {
	ArrayList<Cliente> cola_a=new ArrayList();
	ArrayList<Cliente> cola_b=new ArrayList();
//CONSTRUCTORES
	public Supermercado()
	{}
	public Supermercado(ArrayList<Cliente> cola_a,ArrayList<Cliente> cola_b) {
		setCola_A(cola_a);
		setCola_B(cola_b);
	}
//Getters y Setters
	public void setCola_A(ArrayList<Cliente> cola_a)
	{
		this.cola_a=cola_a;
	}
	public ArrayList<Cliente> getCola_A() 
	{
		return this.cola_a;
	}
	public void setCola_B(ArrayList<Cliente> cola_b) 
	{
		this.cola_b=cola_b;
	}
	public ArrayList<Cliente> getCola_B()
	{
		return this.cola_b;
	}
	public void asignacionFilas(Cliente cliente) 
	{
		if(cliente.determinacion_Fila()==true) 
		{
			getCola_B().add(cliente);
		}else {
			getCola_A().add(cliente);
		}
	}
	//Metodo para reubicacion de lugares en la fila (queda pendiente hacerlo)
	/*public void modificacionUbicacion() 
	{
		Iterator it;
		int x=it.getCola_A.indexOf();
	}*/
//
//toString
	public String toString() 
	{
		return "Cola A: "+"\n"+getCola_A()+"\n"+"Cola B: "+"\n"+getCola_B();
	}
}
