
package LogIn;

import java.util.ArrayList;



public class Usuarios {

    static void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nombre;
    private String apellidos;
    private String usuario;
    private String correo;
    private String contrasenna;
    private String clave;
    private String rol;
    
    public static ArrayList<Usuarios> nuevosUsuarios = new ArrayList<Usuarios>();
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static ArrayList<Usuarios> getNuevosUsuarios() {
        return nuevosUsuarios;
    }

    public static void setNuevosUsuarios(ArrayList<Usuarios> nuevosUsuarios) {
        Usuarios.nuevosUsuarios = nuevosUsuarios;
    }
    

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    

    
        

    
}
