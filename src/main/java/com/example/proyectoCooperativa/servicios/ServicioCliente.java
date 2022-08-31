package com.example.proyectoCooperativa.servicios;
import com.example.proyectoCooperativa.entidaddb.cliente;
import java.util.List;
public interface ServicioCliente {
    public List<cliente>listarClientes();
    public cliente guardarClientes(cliente cl);
    public cliente consultarCleintesPorId(Integer documento);
    public cliente actualizarCliente(cliente cl);
    public  void  eliminarClientes(Integer documento);
}
