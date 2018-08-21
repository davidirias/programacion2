/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author MigSaueda
 */
public class Compra {

    Articulo articulo = new Articulo();
    private float subTotal;
    private float isv;
    private float total;

    public Compra() {
    }        

    public Compra(float subTotal, float isv, float total) {
        this.subTotal = subTotal;
        this.isv = isv;
        this.total = total;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getIsv() {
        return isv;
    }

    public void setIsv(float isv) {
        this.isv = isv;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public float subTotal(){
        float subTotal = 0;        
        subTotal = (articulo.getCantidadProducto() * articulo.getPrecioProducto());
        return subTotal;
    }
        
    
    public String compra(){
        return String.format("Código: "
                + "\nNombre: "
                + "\nDescripción: "
                + "\nCantidad: "
                + "\nPrecio venta: ", 
                articulo.getCodigoProducto(),
                articulo.getNombreProducto(),
                articulo.getDescripcionProducto(),
                articulo.getCantidadProducto(),
                articulo.getPrecioProducto());  
    }

}
