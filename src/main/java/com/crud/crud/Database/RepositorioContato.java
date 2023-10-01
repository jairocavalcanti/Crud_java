package com.crud.crud.Database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato,Long> {
    
}
