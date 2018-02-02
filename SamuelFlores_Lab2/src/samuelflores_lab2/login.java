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
public class login {
    private String lugar;
    private String tipo;
    private String descripcion;
    private String detectiveacargo;
    private String estado;
    private String evidencia;
    private String descripcionevidencia;
    private String niveldepeligrosidad;

    public login() {
    }

    public login(String lugar, String tipo, String descripcion, String detectiveacargo, String estado, String evidencia, String descripcionevidencia, String niveldepeligrosidad) {
        this.lugar = lugar;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.detectiveacargo = detectiveacargo;
        this.estado = estado;
        this.evidencia = evidencia;
        this.descripcionevidencia = descripcionevidencia;
        this.niveldepeligrosidad = niveldepeligrosidad;
    }

    

    

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetectiveacargo() {
        return detectiveacargo;
    }

    public void setDetectiveacargo(String detectiveacargo) {
        this.detectiveacargo = detectiveacargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public String getDescripcionevidencia() {
        return descripcionevidencia;
    }

    public void setDescripcionevidencia(String descripcionevidencia) {
        this.descripcionevidencia = descripcionevidencia;
    }

    public String getNiveldepeligrosidad() {
        return niveldepeligrosidad;
    }

    public void setNiveldepeligrosidad(String niveldepeligrosidad) {
        this.niveldepeligrosidad = niveldepeligrosidad;
    }
    

    @Override
    public String toString() {
        return "lugar = "+lugar+" tipo = "+tipo+" descripcion = "+descripcion+" detectiveacargo = "+detectiveacargo+" estado = "+estado+" evidencia = "+evidencia+" descripcion = "+descripcionevidencia+"peligro = "+niveldepeligrosidad; //To change body of generated methods, choose Tools | Templates.
    }
}

