/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author david
 */
public class NegocioCliente {
    public String nombres;
    public  String apellidos;
    public  String huellaDactilar;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(String huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }
    
}
