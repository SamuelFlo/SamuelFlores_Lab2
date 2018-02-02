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
public class mensaje {
    private String mensaje;
    private String prioridad;
    private String emisor;
    private String receptor;

    public mensaje() {
    }

    public mensaje(String mensaje, String prioridad, String emisor, String receptor) {
        this.mensaje = mensaje;
        this.prioridad = prioridad;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getPrioridad() {
        return prioridad;
    }
    

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "prioridad =  "+prioridad+" mensaje = "+mensaje+"DE: "+emisor+"R: "+receptor; //To change body of generated methods, choose Tools | Templates.
    }
    
}
