package org.acme.model;

import java.util.Date;

public class Tweet {

    private String texto;

    private User usuario;

    private Date fecha;

    private String id;

    public Tweet() {
    }

    public Tweet(String texto, User usuario, Date fecha) {
        this.texto = texto;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
