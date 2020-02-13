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
public class TestSupermercado {

	public static void main(String[] args) {
		Articulo art1=new Articulo("Papel Higienico", 30);
		Articulo art2=new Articulo("Toallas femeninas", 50);
		Articulo art3=new Articulo("Manaos Cola", 60);
		Articulo art4=new Articulo("Papas Fritas", 20);
		Articulo art5=new Articulo("Pan", 40);
		
		Cliente c1=new Cliente();
		Cliente c2=new Cliente();
		Cliente c3=new Cliente();
		Cliente c4=new Cliente();
		Cliente c5=new Cliente();
		Cliente c6=new Cliente();
		Cliente c7=new Cliente();
	
		Supermercado dia=new Supermercado();
		//cliente 1 asignacion de productos
		c1.getProductos().add(art1);
		c1.getProductos().add(art2);
		c1.getProductos().add(art3);
		c1.getProductos().add(art4);
		c1.getProductos().add(art5);
		c1.getProductos().add(art1);
		c1.getProductos().add(art1);
		//cliente 2 asignacion de productos
		c2.getProductos().add(art1);
		c2.getProductos().add(art2);
		c2.getProductos().add(art3);
		
		//prueba
		dia.asignacionFilas(c1);
		dia.asignacionFilas(c2);
		System.out.println(dia.toString());
		//Funciona, falta agregar un metodo que modifique la ubicacion de los clientes
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		
		
	}

}
