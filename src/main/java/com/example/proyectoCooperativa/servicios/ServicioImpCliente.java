package com.example.proyectoCooperativa.servicios;

import com.example.proyectoCooperativa.entidaddb.cliente;
import com.example.proyectoCooperativa.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioImpCliente implements  ServicioCliente{
    @Autowired
    private RepositorioCliente repclient;
    @Override
    public List<cliente> listarClientes() {
        return repclient.findAll();
    }

    @Override
    public cliente guardarClientes(cliente cl) {
        return repclient.save(cl);
    }

    @Override
    public cliente consultarCleintesPorId(Integer documento) {
        return repclient.findById(documento).get();
    }

    @Override
    public cliente actualizarCliente(cliente cl) {
        return repclient.save(cl);
    }

    @Override
    public void eliminarClientes(Integer documento) {
        repclient.deleteById(documento);



    }
}
