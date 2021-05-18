/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author op181
 */
public class Proyect {

    private int codigoCliente, edad;
    private String direccion, telefono, apellidoMaterno, apellidoPaterno, nombre;

    public Proyect() {
    }
public Proyect(int codigoCliente,String nombre,String apellidoPaterno,String apellidoMaterno,String telefono,String direccion,int edad){
    this.codigoCliente=codigoCliente;
    this.nombre=nombre;
    this.apellidoPaterno=apellidoPaterno;
    this.apellidoMaterno=apellidoMaterno;
    this.telefono=telefono;
    this.direccion=direccion;
    this.edad=edad;
}

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
