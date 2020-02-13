package ejer2colecciones;

public class Articulo extends Cliente{
//Atributos
	private String  nombre_producto;
	private Integer precio;
	//CONSTRUCTOR
		Articulo(){
	
		}
		Articulo(String nombre,Integer precio)
		{
			setNombre_Producto(nombre);
			setPrecio(precio);
		}
//GETTERS Y SETTERS
		public String getNombre_Producto() 
		{
			return this.nombre_producto;
		}
		public void setNombre_Producto(String nombre_producto) 
		{
			this.nombre_producto=nombre_producto;
		}
		public Integer getPrecio() 
		{
			return this.precio;
		}
		public void setPrecio(Integer precio) 
		{
			this.precio=precio;
		}
//toString
		public String toString() 
		{
			return "\nProducto: " + "\t\t"+ "Precio: "+"\n"+getNombre_Producto()+"\t\t"+ getPrecio();
		}
}
