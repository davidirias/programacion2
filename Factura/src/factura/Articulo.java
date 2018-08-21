/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author MigSaueda
 */
public class Articulo {

    private LinkedList<Articulo> arrayListArticulo = new LinkedList<>();
    private LinkedList<Articulo> arraySubTotalArticulo = new LinkedList<>();
    private int subCodigoProducto;
    private String subNombreProducto;
    private String subDescripcionProducto;
    private float subPrecioProducto;
    private int subCantidadProducto;
    private float subTotal;
    private int codigoProducto; //Código del producto.
    private String nombreProducto; //Nombre del producto.
    private String descripcionProducto; //Descripcion del producto.
    private int cantidadProducto; // Cantidad del producto.
    private float precioProducto; //Precio del producto.

    //Constructor por defecto.
    public Articulo() {
    }

    //Constructor para inicializar los valores de los atributos al 
    //momento de crear un nuevo objeto.

    public Articulo(int codigoProducto, String nombreProducto, String descripcionProducto, int cantidadProducto, float precioProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }

    public Articulo(int subCodigoProducto, String subNombreProducto, 
            String subDescripcionProducto, float subPrecioProducto, 
            int subCantidadProducto, float subTotal) {
        this.subCodigoProducto = subCodigoProducto;
        this.subNombreProducto = subNombreProducto;
        this.subDescripcionProducto = subDescripcionProducto;
        this.subPrecioProducto = subPrecioProducto;
        this.subCantidadProducto = subCantidadProducto;
        this.subTotal = subTotal;
    }        

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public int getSubCodigoProducto() {
        return subCodigoProducto;
    }

    public void setSubCodigoProducto(int subCodigoProducto) {
        this.subCodigoProducto = subCodigoProducto;
    }

    public String getSubNombreProducto() {
        return subNombreProducto;
    }

    public void setSubNombreProducto(String subNombreProducto) {
        this.subNombreProducto = subNombreProducto;
    }

    public String getSubDescripcionProducto() {
        return subDescripcionProducto;
    }

    public void setSubDescripcionProducto(String subDescripcionProducto) {
        this.subDescripcionProducto = subDescripcionProducto;
    }

    public float getSubPrecioProducto() {
        return subPrecioProducto;
    }

    public void setSubPrecioProducto(float subPrecioProducto) {
        this.subPrecioProducto = subPrecioProducto;
    }

    public int getSubCantidadProducto() {
        return subCantidadProducto;
    }

    public void setSubCantidadProducto(int subCantidadProducto) {
        this.subCantidadProducto = subCantidadProducto;
    }
    
    

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    //Setter and getters de cada atributo.
    public void setPrecioProducto(float precioProducto) {   
        this.precioProducto = precioProducto;
    }

    //Método toString para imprimir la información.
    @Override
    public String toString() {
        return String.format("Código: %s"
                + "\nNombre producto: %s"
                + "\nCantidad producto: "
                + "\nPrecio: %s", this.getCodigoProducto(), this.getNombreProducto(),
                this.getPrecioProducto());
    }

    public String subTotalFormatoListaProductos() {
        return String.format("%s - %s - %s - %s - %s - %s",
                this.getSubCodigoProducto(), this.getSubNombreProducto(),
                this.getSubDescripcionProducto(), this.getSubPrecioProducto(),
                this.getSubCantidadProducto(),this.getSubTotal() );
    }
    
    public String formatoListaProductos() {
        return String.format("%s - %s - %s - %s",
                this.getCodigoProducto(), this.getNombreProducto(),
                this.getCantidadProducto(), this.getPrecioProducto());
    }

    public boolean agregarProducto(Articulo articulo) {
        boolean afirmativo = this.arrayListArticulo.add(articulo);
        return afirmativo;
    }
    
    public boolean agregarSubTotalProducto(Articulo subTotalArticulo) {
        boolean afirmativo = this.arraySubTotalArticulo.add(subTotalArticulo);
        return afirmativo;
    }

    public String listarProductos() {
        String listar = "";
        for (int i = 0; i < this.arrayListArticulo.size(); i++) {
            listar += this.arrayListArticulo.get(i).formatoListaProductos() + "\n";
        }
        return listar;
    }
    
    public String subTotallistarProductos() {
        String listar = "";
        for (int i = 0; i < this.arraySubTotalArticulo.size(); i++) {
            listar += this.arraySubTotalArticulo.get(i).subTotalFormatoListaProductos() + "\n";
        }
        return listar;
    }

   /* public int buscar_producto(int codigo) {
        int indice = -1;
        for (int i = 0; i < this.arrayListArticulo.size(); i++) {
            if (codigo == this.arrayListArticulo.get(i).getCodigoProducto()) {
                indice = i;
                break;
            }
        }
        return indice;
    }
*/
    public Articulo buscar_producto_objeto(int codigo) {
        Articulo productoEncontrado = null;
        for (int i = 0; i < this.arrayListArticulo.size(); i++) {
            if (codigo == this.arrayListArticulo.get(i).getCodigoProducto()) {
                productoEncontrado = this.arrayListArticulo.get(i);
                break;
            }
        }
        return productoEncontrado;
    }

    public String mostrarArticuloBuscado() {
        return String.format(""
                + "Artículo: %s"
                + "\nCantidad disponible: %s"
                + "\nPrecio: %s",
                this.getNombreProducto(),
                this.getCantidadProducto(),
                this.getPrecioProducto());
    }

    public String factura() {
        return String.format(""
                + "Artículo: %s"
                + "\nPrecio: %s",
                this.getNombreProducto(),
                this.getCantidadProducto(),
                this.getPrecioProducto());
    }

    /*
    public String obtn_info_product() {
        String infoProduct = "";
        int i;
        for (i = 0; i < this.InstProducto.size(); i++) {
            infoProduct += this.InstProducto.get(i).producto_parametros() + "\n";
        }
        return infoProduct;
    }
     */

 /*
    public int buscarCodProduct(int codigoProducto) {
        int i, indiceEncontrado = -1;
        for (i = 0; i < this.lstArticulo.size(); i++) {
            if (this.lstArticulo.get(i).getCodigo()== codigoProducto) {
                indiceEncontrado = i;
                break;
            }
        }
        return indiceEncontrado;
    }
    
     public int obtn_ult_cod_product() {
        int i;
        int mayor = 0;
        for (i = 0; i < this.lstArticulo.size(); i++) {
            if (this.lstArticulo.get(i).getCodigo() > mayor) {
                mayor = this.lstArticulo.get(i).getCodigo();
            }
        }
        return mayor;
    }
    
    public boolean agreg_produc(Articulo producto) {
        int codigoProducto = producto.getCodigo();
        int indiceProducto = this.buscarCodProduct(codigoProducto);
        if (indiceProducto == -1) {
            producto.setCodigo(this.obtn_ult_cod_product() + 1);
            this.lstArticulo.add(producto);
            return true;
        } else {
            return false;
        }

    }
     */
}
