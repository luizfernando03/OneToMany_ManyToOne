package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    @Query(value = "select * from clientes cl  full JOIN enderecos e ON cl.codigo=e.cliente_id"
            , nativeQuery = true)
    List<Endereco> getClienteEnderecos();
}
