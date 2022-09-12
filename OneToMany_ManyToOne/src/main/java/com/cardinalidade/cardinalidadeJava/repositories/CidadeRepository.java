package com.cardinalidade.cardinalidadeJava.repositories;


import com.cardinalidade.cardinalidadeJava.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeModel, Long> {

}
