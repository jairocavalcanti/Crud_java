package com.crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud.Database.RepositorioContato;
import com.crud.crud.entidade.Contato;

public class ContatoREST {
    
    @Autowired
    private RepositorioContato repositorio;

   public List<Contato>listar(){
     return repositorio.findAll();
   }

   public void salvar(Contato contato){
     repositorio.save(contato);
   }

   public void alterar(Contato contato){
    if(contato.getId()>0){
     repositorio.save(contato);
    }
   }

    public void excluir(Contato contato){
      repositorio.delete(contato);
    }

  
}
