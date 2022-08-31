package com.example.proyectoCooperativa.entidaddb;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class cliente {
    @Id

    private int documentoCliente;
    @Column(nullable = false,length = 30)
    private String nombre;

    @Column(nullable = false,length = 30)
    private String apellido;

    @Column(nullable = false,length = 30,unique = true)
    private String correo;

    @Column(nullable = false,length = 10,unique = true)
   private String celular;
    @ManyToOne
        @JoinColumn(name = "codigo")
        lineasDeCredito lc;


    public cliente() {
    }

    public cliente(int documentoCliente, String nombre, String apellido, String correo, String celular, lineasDeCredito lc) {
        this.documentoCliente = documentoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.lc = lc;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public lineasDeCredito getLc() {
        return lc;
    }

    public void setLc(lineasDeCredito lc) {
        this.lc = lc;
    }
}
