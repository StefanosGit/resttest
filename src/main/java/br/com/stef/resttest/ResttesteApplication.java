package br.com.stef.resttest;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.stef.resttest.model.Autor;
import br.com.stef.resttest.model.Livro;
import br.com.stef.resttest.repository.AutorRepository;
import br.com.stef.resttest.repository.LivroRepository;

@SpringBootApplication
public class ResttesteApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ResttesteApplication.class, args);
	}
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private AutorRepository autorRepository;
	
	@PostConstruct
	@Transactional
	public void onLoad() {
		
		Autor autor = new Autor();
		autor.setName("R.R.Martin");
		autorRepository.save(autor);
		
        Livro livro = new Livro();
        livro.setTitulo("O Caveleiro dos sete reinos");
        livro.setDescricao("Spin Off de Game of Thrones");
        livro.setNumeroPaginas(555);
 
        livro.add(autor);
 
        livroRepository.save(livro);
        
        livro = new Livro();
        livro.setTitulo("Festim de Corvos");
        livro.setDescricao("Terceiro Livro da saga GOT");
        livro.setNumeroPaginas(666);
 
        livro.add(autor);
 
        livroRepository.save(livro);
		
		autor = new Autor();
		autor.setName("Dan Brown");
		autorRepository.save(autor);
		
        livro = new Livro();
        livro.setTitulo("Codigo Da Vince");
        livro.setDescricao("Best Seller");
        livro.setNumeroPaginas(321);
 
        livro.add(autor);
 
        livroRepository.save(livro);
		
		
	}
	
	
	
	
}
