package cajaregistradora1;
/** 
 * Clase Hogar que hereda atributos y metodos de la Superclase Producto
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */
public class Hogar extends Producto implements Facturable{
/**
 * Constructor de la clase Hogar 
 * @param nombre
 * @param precio
 * @param stock
 * @param caractericas 
 */
    public Hogar(String nombre, float precio,int stock, String caractericas) {
        super(nombre, precio, stock,caractericas);
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
 * obtinene el stock actual del producto
 * @return 
 */
    @Override
    public int obtenerStock() {
        return this.getStock();
        
    }
    
/**
 * actualiza el stock operandolo con la cantidad recibida como parametro
 * @param cantidad 
 */
    @Override
    public void actualizarStok(int cantidad) {
        super.setStock(super.getStock()-cantidad);
    }
/**
 * calcula el valor facturado operando el valor del producto con la cantidad
 * @param cantidad
 * @return 
 */
    @Override
    public int facturar(int cantidad) {
        return (int) this.getPrecio()*cantidad;
    }
   
    // Fin de la clase
}
