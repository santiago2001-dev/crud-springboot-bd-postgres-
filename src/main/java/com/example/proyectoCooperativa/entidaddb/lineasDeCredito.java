package com.example.proyectoCooperativa.entidaddb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lineas_De_Credito")
public class lineasDeCredito {
@Id
    private  int codigo;
@Column(nullable = false,length = 20,unique = true)
private String nombre;
@Column(name = "monto_maximo")
private  int  montoMaximo;
@Column(name = "plazo_maximo")
private int plazoMaximo;


    public lineasDeCredito() {
    }

    public lineasDeCredito(int codigo, String nombre, int montoMaximo, int plazoMaximo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.montoMaximo = montoMaximo;
        this.plazoMaximo = plazoMaximo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(int montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }
}
