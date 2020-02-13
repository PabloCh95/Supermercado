package ejer2colecciones;
import java.util.ArrayList;
public class Cliente extends Supermercado {
//ARTICULOS
	private int ubicacion;
	ArrayList<Articulo> productos=new ArrayList();
//CONSTRUCTORES
	Cliente()
	{
		
	}
	Cliente(int ubicacion,ArrayList<Articulo> productos)
	{
		setUbicacion(ubicacion);
		setProductos(productos);
	}
//GETTERS Y SETTERS
	public int getUbicacion() 
	{
		return this.ubicacion;
	}
	public void setUbicacion(int ubicacion) 
	{
		this.ubicacion=ubicacion;
	}
	public ArrayList<Articulo> getProductos() 
	{
		return this.productos;
	}
	public void setProductos(ArrayList<Articulo> productos) 
	{
		this.productos=productos;
	}
//metodos para contar la cantidad de productos
	public Integer cantidadProductos() 
	{	Integer cantidad;
		cantidad=getProductos().size();
		return cantidad;
	}
//metodos para determinar la ubicacion del cliente
	public boolean determinacion_Fila() 
	{
		if(cantidadProductos()<5) 
		{
			return true;
		}else {
			if(cantidadProductos()>=5) {
				return false;
			}
		}
		return false;
	}
//toString
	public String toString() 
	{
		return "Ubicacion del Cliente: "+ getUbicacion()+"\t\t"+"Cantidad de Productos: "+cantidadProductos()+"\n" + getProductos(); 
	}
}
