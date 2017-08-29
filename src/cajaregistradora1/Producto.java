
package cajaregistradora1;
/** 
 * Superclase Producto que contiene los atributos generales para todas las subclases
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */
public class Producto {
    
    private String nombre;
    private float precio;
    private String caractericas;
    private int stock;
    
/**
 * Constructor de la Superclase Producto 
 * @param nombre
 * @param precio
 * @param stock
 * @param caractericas 
 */
    public Producto(String nombre, float precio,int stock, String caractericas) {
        this.nombre = nombre;
        this.stock=stock;
        this.precio = precio;
        this.caractericas = caractericas;
    }
/**
 * obtiene el Stock del producto
 * @return 
 */
    public int getStock() {
        return stock;
    }
/**
 * modifica el stock con el dato parametro
 * @param stock 
 */
    public void setStock(int stock) {
        this.stock = stock;
    }

/**
 * obtiene el nombre del producto
 * @return 
 */    
    public String getNombre() {
        return nombre;
    }
/**
 * modifica el nombre del producto
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * obtiene el precio del producto
 * @return 
 */
    public float getPrecio() {
        return precio;
    }
/**
 * modifica el precio del producto
 * @param precio 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * obtiene las caracteristicas del producto
 * @return 
 */
    public String getCaractericas() {
        return caractericas;
    }
/**
 * modifica las caracteristicas del producto
 * @param caractericas 
 */
    public void setCaractericas(String caractericas) {
        this.caractericas = caractericas;
    }
    
   // Fin de la Superclase Producto    
}
