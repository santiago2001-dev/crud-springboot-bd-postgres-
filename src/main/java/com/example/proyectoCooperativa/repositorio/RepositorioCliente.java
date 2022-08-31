package com.example.proyectoCooperativa.repositorio;

import com.example.proyectoCooperativa.entidaddb.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<cliente,Integer> {
}
