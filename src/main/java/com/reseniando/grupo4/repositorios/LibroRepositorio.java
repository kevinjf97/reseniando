package com.reseniando.grupo4.repositorios;

import com.reseniando.grupo4.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LibroRepositorio extends JpaRepository<Libro, String> {

    @Query("SELECT l FROM Libro l WHERE l.id = :id")
    List<Libro> buscarLibroPorId(@Param("id") String id);
}