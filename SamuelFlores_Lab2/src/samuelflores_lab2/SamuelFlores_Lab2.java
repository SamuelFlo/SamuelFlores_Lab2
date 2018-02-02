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
    static ArrayList casos = new ArrayList();
    static detectives log;
    static String usuario="";
    static String contrasena="";

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
            if(opcion.equalsIgnoreCase("a")){
                agregar();
            }else if(opcion.equalsIgnoreCase("b")){
                modificar();
                
            }else if(opcion.equalsIgnoreCase("c")){
                eliminar();
                
            }else if(opcion.equalsIgnoreCase("d")){
                usuario=JOptionPane.showInputDialog("Ingrese su usuario: ");
                contrasena=JOptionPane.showInputDialog("Ingrese su contrasena: ");
                for (detectives usuario : detectives) {
                    if(usuario.getUsuario().equals(usuario)&&usuario.getContrasena().equals(contrasena)){
                        System.out.println("BIENVENIDO");
                    }
                    
                }
                
                
            }else if(opcion.equalsIgnoreCase("e")){
                
            }else if(opcion.equals("f")){
                
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
            usuario = JOptionPane.showInputDialog("Ingrese su usuario: ");
            contrasena = JOptionPane.showInputDialog("Ingrese su contrasena: ");
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
    public static void login(){
        
    }
    
    public static boolean contra(String pas, String user){
        for (detectives usuario : detectives) {
            if(usuario.getContrasena().equals(pas)&&usuario.getUsuario().equals(user)){
                log=usuario;
                return true;
            }
        }
        return false;
    }
    
}
