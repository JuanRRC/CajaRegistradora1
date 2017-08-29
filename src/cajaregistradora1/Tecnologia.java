package cajaregistradora1;
/** 
 * Clase Tecnologia que hereda atributos y metodos de la Superclase Producto
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */
public class Tecnologia extends Producto implements Facturable {
/**
 * Constructor de la clase Tecnologia
 * @param nombre
 * @param precio
 * @param stock
 * @param caractericas 
 */
    public Tecnologia(String nombre, float precio,int stock, String caractericas) {
        super(nombre, precio,stock, caractericas);
    }
/**
 * Metodo que imprime los detalles del producto
 */
    @Override
    public void imprimirDetalles() {
        
        System.out.println("nombre: "+this.getNombre());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("stock: "+this.getStock());
        System.out.println("Caracteristicas: "+this.getCaractericas());
    }
/**
 * obtiene el stock actual del producto
 * @return 
 */
    @Override
    public int obtenerStock() {
        return this.getStock();
        
    }
    
/**
 * actualiza la cantidad stock con los datos entrantes
 * @param cantidad 
 */
    @Override
    public void actualizarStok(int cantidad) {
        super.setStock(super.getStock()-cantidad);
    }
/**
 * calcula el valor facturado de los productos seleccionados con el valor parametro
 * @param cantidad
 * @return 
 */
    @Override
    public int facturar(int cantidad) {
        return (int) this.getPrecio()*cantidad;
    }
    
    //fin de la clase
}
