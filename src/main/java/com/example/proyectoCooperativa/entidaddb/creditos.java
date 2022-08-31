package com.example.proyectoCooperativa.entidaddb;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "creditos")
public class creditos {
    @Id

    private int codigo;

    @Column(nullable = false)
    private int montoPestado;

    @Column(nullable = false)
    private int plazoPrestado;

    @Column(nullable = false)
    private Date fechaDesembolso;
    //join tables
    @ManyToOne
    @JoinColumn(name = "documentoCliente")
    cliente cli;

    public creditos(int codigo, int montoPestado, int plazoPrestado, Date fechaDesembolso, cliente cli) {
        this.codigo = codigo;
        this.montoPestado = montoPestado;
        this.plazoPrestado = plazoPrestado;
        this.fechaDesembolso = fechaDesembolso;
        this.cli = cli;
    }

    public creditos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMontoPestado() {
        return montoPestado;
    }

    public void setMontoPestado(int montoPestado) {
        this.montoPestado = montoPestado;
    }

    public int getPlazoPrestado() {
        return plazoPrestado;
    }

    public void setPlazoPrestado(int plazoPrestado) {
        this.plazoPrestado = plazoPrestado;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }
}
