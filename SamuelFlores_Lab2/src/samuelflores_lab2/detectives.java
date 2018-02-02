/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_lab2;

/**
 *
 * @author Samuel
 */
public class detectives {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int anoslaborales;
    private int nivel;
    private String listadecasos;
    private String buzon;
    private String usuario;
    private String contrasena;

    public detectives() {
    }

    public detectives(String nombre, int edad, String nacionalidad, int anoslaborales, int nivel, String listadecasos, String buzon, String usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.anoslaborales = anoslaborales;
        this.nivel = nivel;
        this.listadecasos = listadecasos;
        this.buzon = buzon;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnoslaborales() {
        return anoslaborales;
    }

    public void setAnoslaborales(int anoslaborales) {
        this.anoslaborales = anoslaborales;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getListadecasos() {
        return listadecasos;
    }

    public void setListadecasos(String listadecasos) {
        this.listadecasos = listadecasos;
    }

    public String getBuzon() {
        return buzon;
    }

    public void setBuzon(String buzon) {
        this.buzon = buzon;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return " nombre= "+nombre+" edad= "+edad+" nacionalidad= "+nacionalidad+"anos laborales = "+anoslaborales+"nivel = "+nivel; //To change body of generated methods, choose Tools | Templates.
    }
    
}
