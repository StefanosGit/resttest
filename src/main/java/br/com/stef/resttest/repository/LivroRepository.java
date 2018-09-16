package br.com.stef.resttest.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.stef.resttest.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long>{

}
