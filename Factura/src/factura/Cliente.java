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
public class Cliente extends Persona {

    private String rtn;

    public Cliente() {
    }

    public Cliente(String rtn) {
        this.rtn = rtn;
    }

    public Cliente(String rtn, String nombre, String apellido) {
        super(nombre, apellido);
        this.rtn = rtn;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    

   /* @Override
    public String toString() {
        return String.format("id: "
                + "\nNombre: "
                + "\nApellido:",
                this.getIdPersona(),
                this.getNombrePersona(),
                this.getApellidoPersona());
    }
*/
}
