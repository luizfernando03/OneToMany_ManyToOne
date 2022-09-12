package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
}
