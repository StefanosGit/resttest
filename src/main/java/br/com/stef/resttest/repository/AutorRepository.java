package br.com.stef.resttest.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.stef.resttest.model.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long>{

}
