/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citas_medicas;

/**
 *
 * @author ronald -- mao
 */
public class administrativo {
    
    private String login;
    private String clave;
    private String rol;

    public administrativo() {
    }

    public administrativo(String login, String clave, String rol) {
        this.login = login;
        this.clave = clave;
        this.rol = rol;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
