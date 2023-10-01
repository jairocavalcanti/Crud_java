package com.crud.crud.Database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long> {

}
