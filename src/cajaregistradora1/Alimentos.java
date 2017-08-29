package cajaregistradora1;
/** 
 * Clase Alimentos que hereda atributos y metodos de la clase Producto
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */
public class Alimentos extends Producto implements Facturable {
    
    
    /**
     * Constructor de la clase Alimentos....
     * @param nombre
     * @param precio
     * @param stock
     * @param caracteristicas 
     */
    public Alimentos(String nombre, float precio,int stock, String caracteristicas) {
        super(nombre, precio,stock,caracteristicas);
    }
    
    /**
     *metodo que imprime los detalles de los objetos Alimentos 
     */
    @Override
    public void imprimirDetalles() {
        
        System.out.println("nombre: "+this.getNombre());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("stock: "+this.getStock());
        System.out.println("Caracteristicas: "+this.getCaractericas());
    }
    /**
     * obtiene el stock actual
     * @return 
     */
    @Override
    public int obtenerStock() {
        return this.getStock();
        
    }
    
    /**
     * actualiza el stock actual del programa operandolo con el dato de paametro recibido 
     * @param cantidad 
     */
    @Override
    public void actualizarStok(int cantidad) {
        super.setStock(super.getStock()-cantidad);
    }
    /**
     * calcula el precio facturado con la cantidad de parametro recibida
     * @param cantidad
     * @return 
     */
    @Override
    public int facturar(int cantidad) {
        return (int) this.getPrecio()*cantidad;
    }
    
    
    // Fin de la clase
}
