/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class SamuelFlores_Lab2 {

    static ArrayList<detectives> detectives = new ArrayList();
    static ArrayList<login> casos = new ArrayList();
    static ArrayList<mensaje> mensajeria = new ArrayList();
    static detectives log;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion = "";
        while (!opcion.equalsIgnoreCase("e")) {
            opcion = JOptionPane.showInputDialog("a-Agregar detective\n"
                    + "b-Modificar detectives\n"
                    + "c-Eliminar detectives\n"
                    + "d-Log in\n"
                    + "e-Salir");
            if (opcion.equalsIgnoreCase("a")) {
                agregar();
            } else if (opcion.equalsIgnoreCase("b")) {
                modificar();

            } else if (opcion.equalsIgnoreCase("c")) {
                eliminar();

            } else if (opcion.equalsIgnoreCase("d")) {
                String usuario = JOptionPane.showInputDialog("Ingrese su usuario: ");
                String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena: ");
                if (usuarioex(usuario) && contra(contrasena, usuario)) {
                    String opc = "";
                    while (!opc.equalsIgnoreCase("g")) {
                        opc = JOptionPane.showInputDialog("a-Listar mis datos\n"
                                + "b-Listar casos\n"
                                + "c-Registrar casos\n"
                                + "d-Modificar casos \n"
                                + "e-Enviar mensaje\n"
                                + "f-Listar mensajes\n"
                                + "g-logout");
                        switch (opc) {
                            case "a":
                                salidadedatos();
                                break;
                            case "b":
                                salidadecasos();
                                break;
                            case "c":
                                agregarcasos();
                                break;
                            case "d":
                                modificarcasos();
                                break;
                            case "e":
                                mensaje();
                                break;
                            case "f":
                                listarme();
                                break;
                        }

                    }
                }

            }
        }

    }
    public static void agregar(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String eda = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edad=Integer.parseInt(eda);
        String nacionalidad = JOptionPane.showInputDialog("Ingrese su nacionalidad: ");
        String anoslab = JOptionPane.showInputDialog("Ingrese sus anos laborales: ");
        int anoslaborales=Integer.parseInt(anoslab);
        String niv = JOptionPane.showInputDialog("Ingrese el nivel: ");
        int nivel=Integer.parseInt(niv);
        String listadecasos="";
        String buzon = JOptionPane.showInputDialog("Ingrese su mensaje en el buzon: ");
        String usuario = JOptionPane.showInputDialog("Ingrese su usuario: ");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena: ");
        detectives.add(new detectives(nombre, edad, nacionalidad, anoslaborales, nivel, listadecasos, buzon, usuario, contrasena));
    }
    public static void modificar() {
        String salida = "";
        for (Object temp : detectives) {

            if (temp instanceof detectives) {
                salida += detectives.indexOf(temp) + " ";
                salida += temp + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
        String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        if (pos >= 0 && pos < detectives.size() && detectives.get(pos) instanceof detectives) {
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            String eda = JOptionPane.showInputDialog("Ingrese su edad: ");
            int edad = Integer.parseInt(eda);
            String nacionalidad = JOptionPane.showInputDialog("Ingrese su nacionalidad: ");
            String anoslab = JOptionPane.showInputDialog("Ingrese sus anos laborales: ");
            int anoslaborales = Integer.parseInt(anoslab);
            String niv = JOptionPane.showInputDialog("Ingrese el nivel: ");
            int nivel = Integer.parseInt(niv);
            String listadecasos = "";
            String buzon = JOptionPane.showInputDialog("Ingrese su mensaje en el buzon: ");
            String usuario = JOptionPane.showInputDialog("Ingrese su usuario: ");
            String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena: ");
            detectives.set(pos, new detectives(nombre, edad, nacionalidad, anoslaborales, nivel, listadecasos, buzon, usuario, contrasena));
        }

    }
    public static void eliminar(){
        String salida = "";
        for (Object temp : detectives) {

            if (temp instanceof detectives) {
                salida += detectives.indexOf(temp) + " ";
                salida += temp + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
        String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        if (pos >= 0 && pos < detectives.size() && detectives.get(pos) instanceof detectives) {
            detectives.remove(pos);
        }
        
    }
    public static void agregarcasos(){
        String lugar = JOptionPane.showInputDialog("Ingrese el lugar: ");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo(homicidio, robo, secuestro, violacion): ");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion: ");
        String detectiveacargo= JOptionPane.showInputDialog("Ingrese el detective a cargo: ");
        String estado = JOptionPane.showInputDialog("Ingrese el estado(en proceso, resuelto): ");
        String evidencia="";
        String descripcionevidencia="";
        String niveldepeligrosidad="";
        char r='s';
        while(r=='s'){
             evidencia =JOptionPane.showInputDialog("Ingrese el nombre de la evidencia: ");
             descripcionevidencia=JOptionPane.showInputDialog("Ingrese la descripcion de la evidencia: ");
             niveldepeligrosidad=JOptionPane.showInputDialog("Ingrese el nivel de peligrosidad: "); 
             String res=JOptionPane.showInputDialog("Desea seguir agregando evidencia: ");
             r=res.charAt(0);
        }
        casos.add(new login( lugar,  tipo, descripcion, detectiveacargo, estado, evidencia, descripcionevidencia, niveldepeligrosidad));
        
        
   
    }
    public static void salidadedatos(){
        String salida = "";
        for (detectives temp : detectives) {

            if (temp instanceof detectives) {
                salida += detectives.indexOf(temp) + " ";
                salida += temp + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    public static void salidadecasos(){
        String salida = "";
        for (login temp : casos) {
            if (temp instanceof login) {
                salida += casos.indexOf(temp) + " ";
                salida += temp + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    public static void modificarcasos() {
        String pos1 = JOptionPane.showInputDialog("Ingrese la posicion que desea modificar: ");
        int pos = Integer.parseInt(pos1);
        if (pos >= 0 && pos < casos.size() && casos.get(pos) instanceof login) {
            String lugar = JOptionPane.showInputDialog("Ingrese el lugar: ");
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo(homicidio, robo, secuestro, violacion): ");
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion: ");
            String detectiveacargo = JOptionPane.showInputDialog("Ingrese el detective a cargo: ");
            String estado = JOptionPane.showInputDialog("Ingrese el estado(en proceso, resuelto): ");
            String evidencia="";
            String descripcionevidencia = "";
            String niveldepeligrosidad = "";
            char r = 's';
            while (r == 's') {
                evidencia = JOptionPane.showInputDialog("Ingrese el nombre de la evidencia: ");
                descripcionevidencia = JOptionPane.showInputDialog("Ingrese la descripcion de la evidencia: ");
                niveldepeligrosidad = JOptionPane.showInputDialog("Ingrese el nivel de peligrosidad: ");
                String res = JOptionPane.showInputDialog("Desea seguir agregando evidencia: ");
                r = res.charAt(0);
            }
             casos.add(new login( lugar,  tipo, descripcion, detectiveacargo, estado, evidencia, descripcionevidencia, niveldepeligrosidad));
        }
    }
    public static boolean usuarioex(String usuario) {
        for (detectives user: detectives) {
            if (user.getUsuario().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    public static boolean contra(String pas,String user){
        for (detectives usuario : detectives) {
            if(usuario.getContrasena().equals(pas)&&usuario.getUsuario().equals(user)){
                log=usuario;
                return true;
            }
        }
        return false;
    }
    public static void mensaje(){
        String prioridad = JOptionPane.showInputDialog("Ingrese la prioridad: ");
        String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje: ");
        String emisor = JOptionPane.showInputDialog("Ingrese el emisor: ");
        String receptor = JOptionPane.showInputDialog("Ingrese el receptor: ");
        mensajeria.add(new mensaje(mensaje, prioridad, emisor, receptor));
    }
    public static void listarme(){
        String salida = "";
        for (mensaje temp : mensajeria) {
            if (temp instanceof mensaje) {
                salida += casos.indexOf(temp) + " ";
                salida += temp + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    
}
