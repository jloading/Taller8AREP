package org.acme.model;

public class User {

    private String nombre;
    private String clave;
    private String correo;
    private String id;


    public User() {
    }

    public User(String nombre, String clave, String correo) {
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


}

