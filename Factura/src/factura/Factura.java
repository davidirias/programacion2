/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author MigSaueda
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Articulo articulo = new Articulo();
        Cliente cliente = new Cliente();
        Detalle detalle = new Detalle();
        Compra compra = new Compra();

        int codigoProducto; //Código del producto.
        String nombreProducto; //Nombre del producto.
        String descripcionProducto; //Descripcion del producto
        int cantidadProducto; // Cantidad del producto.
        float precioProducto; //Precio del producto.

        //int nombFact = 0;
        //String fecha;
        float subTotal = 0;
        float y = 0;
        float x = 0;
        String idCliente;
        String nombreCliente = "";
        String apellidoCliente = "";
        String rtn = "";
        String telefonoCliente;

        float precio = 0;
        float cantidad = 0;
        int guardar;

        int whileMenPrinc = 1;
        while (whileMenPrinc == 1) {
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("----------------------------");
            System.out.println("////////////////////////////");
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("////////////////////////////");
            System.out.println("----------------------------");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Realizar venta");
            System.out.println("4. Mostrar lista prodctos");
            System.out.println("5. Salir.");
            System.out.println("----------------------------");
            System.out.print("Opción menú: ");
            int switchMenu = entrada.nextInt();
            System.out.println("----------------------------");
            switch (switchMenu) {
                case 1:
                    int whileAgregarProducto = 1;
                    while (whileAgregarProducto == 1) {
                        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println("----------------------------");
                        System.out.println("////////////////////////////");
                        System.out.println("AGREGAR PRODUCTO");
                        System.out.println("////////////////////////////");
                        System.out.println("----------------------------");
                        System.out.print("Código producto: ");
                        codigoProducto = entrada.nextInt();
                        System.out.print("Nombre producto: ");
                        nombreProducto = entrada.next();
                        System.out.print("Descripción producto: ");
                        descripcionProducto = entrada.next();
                        System.out.print("Cantidad producto: ");
                        cantidadProducto = entrada.nextInt();
                        System.out.print("Precio producto: ");
                        precioProducto = entrada.nextInt();
                        System.out.println("----------------------------");
                        System.out.println("¿Guardar.?");
                        System.out.println("----------------------------");
                        System.out.print("1. Si"
                                + "\n2. No"
                                + "\n----------------------------"
                                + "\nR: ");
                        guardar = entrada.nextInt();
                        if (guardar == 1) {
                            System.out.println("----------------------------");
                            Articulo articulo1 = new Articulo(codigoProducto, nombreProducto,
                                    descripcionProducto, cantidadProducto, precioProducto);
                            boolean msj = articulo.agregarProducto(articulo1);
                            System.out.println("!Producto agregado.¡");
                            System.out.println("----------------------------");
                            whileAgregarProducto = 2;
                        } else {
                            whileAgregarProducto = 2;
                            System.out.println("----------------------------");
                        }
                    }
                    break;
                case 2:
                    int whileAgregarCliente = 1;
                    while (whileAgregarCliente == 1) {
                        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println("----------------------------");
                        System.out.println("////////////////////////////");
                        System.out.println("AGREGAR CLIENTE");
                        System.out.println("////////////////////////////");
                        System.out.println("----------------------------");
                        System.out.print("Id cliente: ");
                        idCliente = entrada.next();
                        System.out.print("Nombre cliente: ");
                        nombreCliente = entrada.next();
                        System.out.print("Apellido cliente: ");
                        apellidoCliente = entrada.next();
                        System.out.print("RTN cliente: ");
                        rtn = entrada.next();
                        System.out.println("----------------------------");
                        System.out.println("¿Guardar.?");
                        System.out.println("----------------------------");
                        System.out.print("1. Si"
                                + "\n2. No"
                                + "\n----------------------------"
                                + "\nR: ");
                        int guardar1 = 0;
                        guardar1 = entrada.nextInt();
                        if (guardar1 == 1) {
                            System.out.println("----------------------------");
                            cliente = new Cliente(rtn, nombreCliente, apellidoCliente);
                            System.out.println("!Cliente guardado.¡");
                            System.out.println("----------------------------");
                            whileAgregarCliente = 2;
                        } else {
                            System.out.println("----------------------------");
                            whileAgregarCliente = 2;
                        }
                    }
                    break;
                case 3:
                    System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println("----------------------------");
                    System.out.println("////////////////////////////");
                    System.out.println("REALIZAR VENTA");
                    System.out.println("////////////////////////////");
                    System.out.println("----------------------------");
                    System.out.print("N° Factura: ");
                    String noFact = entrada.next();
                    System.out.print("Fecha: ");
                    String fecha = entrada.next();
                    System.out.println("----------------------------");
                    System.out.print("¿Con nombre la factuta?"
                            + "\n----------------------------"
                            + "\n1. Si."
                            + "\n2. No."
                            + "\n----------------------------"
                            + "\nR: ");
                    int nombFact = entrada.nextInt();
                    if (nombFact == 1) {
                        System.out.println("----------------------------");
                        System.out.print("RTN: ");
                        rtn = entrada.next();
                        System.out.print("Nombre: ");
                        nombreCliente = entrada.next();
                        System.out.print("Apellido: ");
                        apellidoCliente = entrada.next();
                    }
                    int whileVenta = 1;
                    while (whileVenta == 1) {
                        System.out.println("----------------------------");
                        System.out.println("--- Productos disponibles a vender ---");
                        System.out.println(articulo.listarProductos());
                        System.out.println("----------------------------");
                        System.out.print("Código producto a vender: ");
                        int codProdct = entrada.nextInt();
                        Articulo buscArtc = articulo.buscar_producto_objeto(codProdct);
                        System.out.println(buscArtc.mostrarArticuloBuscado());
                        System.out.print("Cantidad a vender: ");
                        cantidad = entrada.nextFloat();
                        subTotal = cantidad * buscArtc.getPrecioProducto();
                        int subCodigo = buscArtc.getCodigoProducto();
                        String subNombre = buscArtc.getNombreProducto();
                        String subDescrp = buscArtc.getDescripcionProducto();
                        float subPrecio =  buscArtc.getPrecioProducto();
                        int subCantidad = (int) cantidad;
                        
                        Articulo subTotalArticulo = new Articulo(subCodigo,subNombre,subDescrp ,
                                subPrecio, subCantidad, subTotal);
                        boolean msj = articulo.agregarSubTotalProducto(subTotalArticulo);
                        y = (float) (cantidad * buscArtc.getPrecioProducto()) + x;
                        x = y;
                        System.out.println("SubTotal: " + subTotal);
                        System.out.println("----------------------------");
                        System.out.print("¿Desea comprar otro producto?"
                                + "\n1. Si."
                                + "\n2. No."
                                + "\n----------------------------"
                                + "\nR: ");

                        whileVenta = entrada.nextInt();
                    }
                    System.out.println("----------------------------");
                    System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println("N° Factura: " + noFact);
                    System.out.println("Fecha: " + fecha);
                    System.out.println("RTN: " + rtn);
                    System.out.println("Nombre: " + (nombreCliente + " " + apellidoCliente));
                    System.out.print("----------------------------");
                    System.out.println("\nDetalles:");
                    System.out.println("Cod./Nomb./Descp./Prec./Cantd./SubT");
                    System.out.println(articulo.subTotallistarProductos());
                    System.out.println("----------------------------");
                    System.out.println("SubTotal: " + x);
                    float h = 0;
                    h = (float) (x * 0.15);
                    System.out.println("ISV: " + h);
                    System.out.println("Total: " + (x + h));
                    break;
                case 4:
                    System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println("----------------------------");
                    System.out.println("////////////////////////////");
                    System.out.println("ARTICULOS INGRESADOS");
                    System.out.println("////////////////////////////");
                    System.out.println("----------------------------");
                    System.out.println(articulo.listarProductos());
                    System.out.println(articulo.subTotallistarProductos());
                    System.out.println("----------------------------");
                    break;
                case 5:
                    whileMenPrinc = switchMenu;
                    break;
                default:
                    break;
            }

        }
    }

}
