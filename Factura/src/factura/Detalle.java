/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.LinkedList;

/**
 *
 * @author MigSaueda
 */
public class Detalle {
    private LinkedList<Detalle> arrayListDetalle = new LinkedList<>();

    
    
    private String fecha;
    private String numeroFactura;
    Cliente cliente;

    public Detalle() {
    }

    public Detalle(String fecha, String numeroFactura, Cliente cliente) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String detalle(){
        return String.format("N° Factura: "
                + "\nFecha: "
                + "\nRTN: "
                + "\nNombre: " ,
                this.getNumeroFactura(),
                this.getFecha(),
                cliente.getRtn(),
                cliente.getNombre(),
                cliente.getApellido());
    }
    
}
